package com.github.experienceofservice.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Objects;

@JsonSerialize
public class FirstContractDate {
    private int firstContractYear;
    private int firstContractMonth;
    private int firstContractDay;

    public FirstContractDate(int firstContractYear, int firstContractMonth, int firstContractDay) {
        this.firstContractYear = firstContractYear;
        this.firstContractMonth = firstContractMonth;
        this.firstContractDay = firstContractDay;
    }

    public FirstContractDate() {
    }

    public int getFirstContractYear() {
        return firstContractYear;
    }

    public void setFirstContractYear(int firstContractYear) {
        this.firstContractYear = firstContractYear;
    }

    public int getFirstContractMonth() {
        return firstContractMonth;
    }

    public void setFirstContractMonth(int firstContractMonth) {
        this.firstContractMonth = firstContractMonth;
    }

    public int getFirstContractDay() {
        return firstContractDay;
    }

    public void setFirstContractDay(int firstContractDay) {
        this.firstContractDay = firstContractDay;
    }

    @Override
    public String toString() {
        return "FirstContractDate{" +
                "firstContractYear=" + firstContractYear +
                ", firstContractMonth=" + firstContractMonth +
                ", firstContractDay=" + firstContractDay +
                '}';
    }
}
