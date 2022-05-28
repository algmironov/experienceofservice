package com.github.experienceofservice.service;

import com.github.experienceofservice.model.*;

public interface DateService {

    RegularExperience getRegularExperience(FirstContractDate zeroExperience);

    PreferentialExperience calculatePreferentialExperience(FirstContractDate firstContractDate);

    OverallExperience getOverallExperience(ArmyExperience armyExperience, AcademyExperience academyExperience,
                                           RegularExperience regularExperience, PreferentialExperience preferentialExperience);

    String getExperienceInfo(ArmyExperience armyExperience, AcademyExperience academyExperience,
                             FirstContractDate firstContractDate);
}
