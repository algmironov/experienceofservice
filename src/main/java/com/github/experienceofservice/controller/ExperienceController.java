package com.github.experienceofservice.controller;

import com.github.experienceofservice.model.*;
import com.github.experienceofservice.service.DateService;
import com.github.experienceofservice.service.impl.DateServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("experience")
public class ExperienceController {

    private final DateService dateServiceImpl;

    public ExperienceController(DateService dateServiceImpl) {
        this.dateServiceImpl = dateServiceImpl;
    }

    @PostMapping()
    public ResponseEntity<RegularExperience> getRegularExperience(@RequestParam int armyYears, @RequestParam int armyMonths,
                                                                  @RequestParam int academyYears, @RequestParam int academyMonths,
                                                                  @RequestBody FirstContractDate firstContractDate) {
        RegularExperience regularExperience = dateServiceImpl.getRegularExperience(armyYears, armyMonths, academyYears,
                                                                                    academyMonths, firstContractDate);
        return ResponseEntity.ok(regularExperience);
    }

    @PostMapping("/prefExp")
    public ResponseEntity<PreferentialExperience> getPreferentialExperience(FirstContractDate firstContractDate) {
        PreferentialExperience preferentialExperience = dateServiceImpl.calculatePreferentialExperience(firstContractDate);
        return ResponseEntity.ok(preferentialExperience);
    }

    @PostMapping("/getInfo")
    public ResponseEntity<String> getExperienceInfo(@RequestParam int armyYears, @RequestParam int armyMonths,
                                                    @RequestParam int academyYears, @RequestParam int academyMonths,
                                                    @RequestBody FirstContractDate firstContractDate) {

        return ResponseEntity.ok(dateServiceImpl.getExperienceInfo(armyYears, armyMonths, academyYears, academyMonths,
                firstContractDate));
    }
}
