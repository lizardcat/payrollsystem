package com.payrollsystem.models;

public class Payroll {
    private Employee employee; // Reference to the Employee object
    private double basicSalary;
    private double taxDeductions;
    private double benefits;
    private double netPay;

    public Payroll(Employee employee) {
        this.employee = employee;
        this.basicSalary = employee.getBasicSalary();
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getTaxDeductions() {
        return taxDeductions;
    }

    public void setTaxDeductions(double taxDeductions) {
        this.taxDeductions = taxDeductions;
    }

    public double getBenefits() {
        return benefits;
    }

    public void setBenefits(double benefits) {
        this.benefits = benefits;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }

    public void calculatePayroll() {
        // Placeholder for payroll calculation logic, calculating netPay based on deductions and benefits
    }
}
