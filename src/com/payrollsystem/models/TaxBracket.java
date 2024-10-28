package com.payrollsystem.models;

public class TaxBracket {
    private double minSalary;
    private double maxSalary;
    private double taxRate;

    public TaxBracket(double minSalary, double maxSalary, double taxRate) {
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.taxRate = taxRate;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
}