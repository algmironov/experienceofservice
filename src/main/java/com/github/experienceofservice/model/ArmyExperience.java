package com.github.experienceofservice.model;

public class ArmyExperience {
    private int armyYears;
    private int armyMonths;

    public ArmyExperience() {
    }

    public ArmyExperience(int armyYears, int armyMonths) {
        this.armyYears = armyYears;
        this.armyMonths = armyMonths;
    }

    public int getArmyYears() {
        return armyYears;
    }

    public void setArmyYears(int armyYears) {
        this.armyYears = armyYears;
    }

    public int getArmyMonths() {
        return armyMonths;
    }

    public void setArmyMonths(int armyMonths) {
        this.armyMonths = armyMonths;
    }

    @Override
    public String toString() {
        return "ArmyExperience{" +
                "armyYears=" + armyYears +
                ", armyMonths=" + armyMonths +
                '}';
    }
}
