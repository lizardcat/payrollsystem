package com.payrollsystem.models;

public class Employee {
    private String id;
    private String name;
    private Position position;
    private double basicSalary;
    private String bankDetails;
    private String kraPin;
    private double personalRelief;
    private double netPay;

    // Constructor
    public Employee(String id, String name, Position position, double basicSalary, String bankDetails, String kraPin) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.basicSalary = basicSalary;
        this.bankDetails = bankDetails;
        this.kraPin = kraPin;
        this.personalRelief = 0.0;
    }

    // Getter and Setter Methods

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public String getKraPin() {
        return kraPin;
    }

    public double getPersonalRelief() {
        return personalRelief;
    }

    public void setPersonalRelief(double personalRelief) {
        this.personalRelief = personalRelief;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }

    // Method to calculate net pay
    public void calculateNetPay() {
        // Placeholder for calculation logic, which will calculate net pay based on tax and deductions
    }
}
