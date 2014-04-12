package com.vk;

public class Programmer extends Employee {
    private double timeInMonth;
    private double salaryConst;

    Programmer(String name, String specialty, double timeInMonth, double salaryConst) {
        super(name, specialty);
        this.timeInMonth = timeInMonth;
        this.salaryConst = salaryConst;
    }

     @Override
    public double calculateSalary() {
        double salary = timeInMonth * salaryConst;
        return salary;
    }
}
