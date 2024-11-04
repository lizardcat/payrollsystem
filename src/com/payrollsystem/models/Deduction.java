package com.payrollsystem.models;

public class Deduction {
    private int id;
    private int employeeId;
    private String type; // Type of deduction (e.g., NHIF, loan)
    private double amount;

    // Constructor
    public Deduction(int id, int employeeId, String type, double amount) {
        this.id = id;
        this.employeeId = employeeId;
        this.type = type;
        this.amount = amount;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
