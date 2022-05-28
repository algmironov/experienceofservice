package com.github.experienceofservice.model;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class RegularExperience {

    private int regularYears;
    private int regularMonths;
    private int regularDays;

    public RegularExperience() {
    }

    public RegularExperience(int regularYears, int regularMonths, int regularDays) {
        this.regularYears = regularYears;
        this.regularMonths = regularMonths;
        this.regularDays = regularDays;
    }

    public int getRegularYears() {
        return regularYears;
    }

    public void setRegularYears(int regularYears) {
        this.regularYears = regularYears;
    }

    public int getRegularMonths() {
        return regularMonths;
    }

    public void setRegularMonths(int regularMonths) {
        this.regularMonths = regularMonths;
    }

    public int getRegularDays() {
        return regularDays;
    }

    public void setRegularDays(int regularDays) {
        this.regularDays = regularDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegularExperience)) return false;
        RegularExperience that = (RegularExperience) o;
        return getRegularYears() == that.getRegularYears() && getRegularMonths() == that.getRegularMonths() && getRegularDays() == that.getRegularDays();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRegularYears(), getRegularMonths(), getRegularDays());
    }

    @Override
    public String toString() {
        return "RegularExperience{" +
                "regularYears=" + regularYears +
                ", regularMonths=" + regularMonths +
                ", regularDays=" + regularDays +
                '}';
    }

//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//    LocalDate startDate = LocalDate.parse("28.01.2009", formatter);
//    LocalDate endDate = LocalDate.parse("05.03.2013", formatter);
//    Period period = Period.between(startDate, endDate);
//    System.out.println(period.getYears());      // 4
//    System.out.println(period.getMonths());     // 1
//    System.out.println(period.getDays());       // 5


}
