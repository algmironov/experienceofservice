package com.github.experienceofservice.service.impl;

import com.github.experienceofservice.model.*;
import com.github.experienceofservice.service.DateService;
import org.joda.time.Days;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.DAYS;

@Service
public class DateServiceImpl implements DateService {

    DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;

    @Override
    public RegularExperience getRegularExperience(FirstContractDate firstContractDate) {

        String tmpDate = formatter.format(LocalDate.of(firstContractDate.getFirstContractYear(),
                                                        firstContractDate.getFirstContractMonth(),
                                                        firstContractDate.getFirstContractDay()));
            LocalDate startDate = LocalDate.parse(tmpDate, formatter);
            LocalDate endDate = LocalDate.now();
            Period experience = Period.between(startDate, endDate);

            return  new RegularExperience(experience.getYears(), experience.getMonths(), experience.getDays());
    }


    @Override
    public PreferentialExperience calculatePreferentialExperience(FirstContractDate firstContractDate) {
        int calculatedDays, calculatedMonths, calculatedYears;

        String tmpDate = formatter.format(LocalDate.of(firstContractDate.getFirstContractYear(),
                firstContractDate.getFirstContractMonth(),
                firstContractDate.getFirstContractDay()));
        LocalDate startDate = LocalDate.parse(tmpDate, formatter);
        LocalDate endDate = LocalDate.now();

        Period period = Period.between(startDate, endDate);
        long regularDays = DAYS.between(startDate, endDate);

        int prDays = (int) (regularDays /2);

        calculatedYears = prDays / 365;
        calculatedMonths = (prDays % 365) / 31;
        calculatedDays = (prDays % 365) % 31;

        return new PreferentialExperience(calculatedYears, calculatedMonths, calculatedDays);
    }

    @Override
    public OverallExperience getOverallExperience(ArmyExperience armyExperience, AcademyExperience academyExperience,
                                                  RegularExperience regularExperience, PreferentialExperience preferentialExperience) {

        int overallDays, overallMonths, overallYears;
        int overallMonthsAddition = 0;
        int overallYearsAddition = 0;

        overallDays = regularExperience.getRegularDays() + preferentialExperience.getPreferentialDays();
        if (overallDays > 31) {
            overallDays = overallDays - 31;
            overallMonthsAddition += 1;
        }

        overallMonths = armyExperience.getArmyMonths() + academyExperience.getAcademyMonths()
                + regularExperience.getRegularMonths() + preferentialExperience.getPreferentialMonths() + overallMonthsAddition;

        if (overallMonths > 12) {
            overallMonths = overallMonths - 12;
            overallYearsAddition += 1;
        }

        overallYears = armyExperience.getArmyYears() + academyExperience.getAcademyYears()
                + regularExperience.getRegularYears()
                + preferentialExperience.getPreferentialYears() + overallYearsAddition;


        return new OverallExperience(overallYears, overallMonths, overallDays);
    }

    @Override
    public String getExperienceInfo(ArmyExperience armyExperience, AcademyExperience academyExperience,
                                    FirstContractDate firstContractDate) {
        RegularExperience regularExperience = getRegularExperience(firstContractDate);
        PreferentialExperience preferentialExperience = calculatePreferentialExperience(firstContractDate);
        OverallExperience overallExperience = getOverallExperience(armyExperience, academyExperience,
                regularExperience, preferentialExperience);

        String result = "Общая выслуга: " + regularExperience.getRegularYears() + " лет " + regularExperience.getRegularMonths() + " месяцев "
                + regularExperience.getRegularDays() + " дней | льготная: " + preferentialExperience.getPreferentialYears() + " лет " +
                preferentialExperience.getPreferentialMonths() + " месяцев " + preferentialExperience.getPreferentialDays() + " дней | общая: " +
                overallExperience.getOverallYears() + " лет " + overallExperience.getOverallMonths() + " месяцев " + overallExperience.getOverallDays() + " дней";
        return result;
    }




}
