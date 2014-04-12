package com.vk;

public class Manager extends Employee {
    private double rate;      //salary in month;
    private double time;         //number of hours per month laid on a flat rate.
    private double timeInMonth;


    public Manager(String name, String specialty, double rate, double time, double timeInMonth) {
        super(name, specialty);
        this.rate = rate;
        this.time = time;
        this.timeInMonth = timeInMonth;
    }

    @Override
    public double calculateSalary() {
        double salary = timeInMonth * rate / time;
        return salary;
    }
}
