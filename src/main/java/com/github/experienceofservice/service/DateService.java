package com.github.experienceofservice.service;

import com.github.experienceofservice.model.*;

public interface DateService {

    RegularExperience getRegularExperience(int armyYears, int armyMonths,
                                           int academyYears, int academyMonths,
                                           FirstContractDate zeroExperience);

    PreferentialExperience calculatePreferentialExperience(FirstContractDate firstContractDate);

    OverallExperience getOverallExperience(ArmyExperience armyExperience, AcademyExperience academyExperience,
                                           RegularExperience regularExperience, PreferentialExperience preferentialExperience);

    String getExperienceInfo(int armyYears, int armyMonths,
                             int academyYears, int academyMonths,
                             FirstContractDate firstContractDate);
}
