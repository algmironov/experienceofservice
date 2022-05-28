package com.github.experienceofservice.model;
import javax.persistence.Entity;
import java.util.Date;
import java.util.Calendar;

public class OverallExperience {

    private int overallYears;
    private int overallMonths;
    private int overallDays;

    public OverallExperience() {
    }

    public OverallExperience(int overallYears, int overallMonths, int overallDays) {
        this.overallYears = overallYears;
        this.overallMonths = overallMonths;
        this.overallDays = overallDays;
    }

    public int getOverallYears() {
        return overallYears;
    }

    public void setOverallYears(int overallYears) {
        this.overallYears = overallYears;
    }

    public int getOverallMonths() {
        return overallMonths;
    }

    public void setOverallMonths(int overallMonths) {
        this.overallMonths = overallMonths;
    }

    public int getOverallDays() {
        return overallDays;
    }

    public void setOverallDays(int overallDays) {
        this.overallDays = overallDays;
    }

    @Override
    public String toString() {
        return "OverallExperience{" +
                "overallYears=" + overallYears +
                ", overallMonths=" + overallMonths +
                ", overallDays=" + overallDays +
                '}';
    }
}
