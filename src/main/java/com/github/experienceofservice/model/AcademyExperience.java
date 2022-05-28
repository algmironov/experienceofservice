package com.github.experienceofservice.model;

public class AcademyExperience {

    private int academyYears;
    private int academyMonths;

    public AcademyExperience(int academyYears, int academyMonths) {
        this.academyYears = academyYears;
        this.academyMonths = academyMonths;
    }

    public AcademyExperience() {
    }

    public int getAcademyYears() {
        return academyYears;
    }

    public void setAcademyYears(int academyYears) {
        this.academyYears = academyYears;
    }

    public int getAcademyMonths() {
        return academyMonths;
    }

    public void setAcademyMonths(int academyMonths) {
        this.academyMonths = academyMonths;
    }

    @Override
    public String toString() {
        return "AcademyExperience{" +
                "academyYears=" + academyYears +
                ", academyMonths=" + academyMonths +
                '}';
    }
}
