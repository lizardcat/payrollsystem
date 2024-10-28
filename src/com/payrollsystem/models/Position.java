package com.payrollsystem.models;

public class Position {
    private String positionName; // Job title or role of the employee
    private double baseSalary; // Overtime pay rate for hours beyond standard work hours

    public Position(String positionName, double baseSalary) {
        this.positionName = positionName;
        this.baseSalary = baseSalary;
    }
     // Setters and getters

     public String getPositionName() {
         return positionName;
     }

     public void setPositionName(String positionName) {
         this.positionName = positionName;
     }

     public double getBaseSalary() {
        return baseSalary;
     }

     public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
     }
}
