package com.vk;

public class Programmer extends Employee {
    private double timeInMonth;
    private double salaryConst;

    Programmer(String name, double timeInMonth, double salaryConst) {
        super(name);
        this.timeInMonth = timeInMonth;
        this.salaryConst = salaryConst;
    }
    @Override
    public double calculateSalary() {
        double salary = timeInMonth * salaryConst;
        System.out.println(getName()+" programmer with a salary: " + salary);
        return salary;
    }
}
