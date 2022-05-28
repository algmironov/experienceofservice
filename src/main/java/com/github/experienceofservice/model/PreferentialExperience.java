package com.github.experienceofservice.model;

import java.util.Objects;

public class PreferentialExperience {

    private int preferentialYears;
    private int preferentialMonths;
    private int preferentialDays;

    public PreferentialExperience() {
    }

    public PreferentialExperience(int preferentialYears, int preferentialMonths, int preferentialDays) {
        this.preferentialYears = preferentialYears;
        this.preferentialMonths = preferentialMonths;
        this.preferentialDays = preferentialDays;
    }

    public int getPreferentialYears() {
        return preferentialYears;
    }

    public void setPreferentialYears(int preferentialYears) {
        this.preferentialYears = preferentialYears;
    }

    public int getPreferentialMonths() {
        return preferentialMonths;
    }

    public void setPreferentialMonths(int preferentialMonths) {
        this.preferentialMonths = preferentialMonths;
    }

    public int getPreferentialDays() {
        return preferentialDays;
    }

    public void setPreferentialDays(int preferentialDays) {
        this.preferentialDays = preferentialDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PreferentialExperience)) return false;
        PreferentialExperience that = (PreferentialExperience) o;
        return getPreferentialYears() == that.getPreferentialYears() && getPreferentialMonths() == that.getPreferentialMonths() && getPreferentialDays() == that.getPreferentialDays();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPreferentialYears(), getPreferentialMonths(), getPreferentialDays());
    }

    @Override
    public String toString() {
        return "PreferentialExperience{" +
                "preferentialYears=" + preferentialYears +
                ", preferentialMonths=" + preferentialMonths +
                ", preferentialDays=" + preferentialDays +
                '}';
    }
}
