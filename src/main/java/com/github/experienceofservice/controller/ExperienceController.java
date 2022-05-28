package com.github.experienceofservice.controller;

import com.github.experienceofservice.model.*;
import com.github.experienceofservice.service.DateService;
import com.github.experienceofservice.service.impl.DateServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("experience")
public class ExperienceController {

    private final DateService dateServiceImpl;

    public ExperienceController(DateService dateServiceImpl) {
        this.dateServiceImpl = dateServiceImpl;
    }

    @PostMapping()
    public ResponseEntity<RegularExperience> getRegularExperience(@RequestBody FirstContractDate firstContractDate) {
        RegularExperience regularExperience = dateServiceImpl.getRegularExperience(firstContractDate);
        return ResponseEntity.ok(regularExperience);
    }

    @PostMapping("/prefExp")
    public ResponseEntity<PreferentialExperience> getPreferentialExperience(FirstContractDate firstContractDate) {
        PreferentialExperience preferentialExperience = dateServiceImpl.calculatePreferentialExperience(firstContractDate);
        return ResponseEntity.ok(preferentialExperience);
    }

    @PostMapping("/getInfo")
    public ResponseEntity<String> getExperienceInfo(@RequestBody ArmyExperience armyExperience, @RequestBody AcademyExperience academyExperience,
                                                    @RequestBody FirstContractDate firstContractDate) {

        return ResponseEntity.ok(dateServiceImpl.getExperienceInfo(armyExperience, academyExperience, firstContractDate));
    }
}
