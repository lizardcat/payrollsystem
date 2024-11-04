package com.payrollsystem.models;

import java.util.Date;

public class PayrollHistory {
    private int id;
    private int employeeId;
    private Date date;
    private double grossPay;
    private double deductions;
    private double netPay;

    // Constructor
    public PayrollHistory(int id, int employeeId, Date date, double grossPay, double deductions, double netPay) {
        this.id = id;
        this.employeeId = employeeId;
        this.date = date;
        this.grossPay = grossPay;
        this.deductions = deductions;
        this.netPay = netPay;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeid() {
        return employeeId;
    }

    public void setEmployeeId(int employeeID) {
        this.employeeId = employeeId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

}
