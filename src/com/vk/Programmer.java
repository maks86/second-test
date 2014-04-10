package com.vk;

public class Programmer extends Employee {

    Programmer(String name) {
        super(name);
    }

    public double calculateSalary(double timeInMonth,double salaryConst) {
        double salary = timeInMonth * salaryConst;
        System.out.println(getName() + " programmer earns is " + salary);
        return salary;
    }
    @Override
    public double calculateSalary() {
        return 0;
    }
}
