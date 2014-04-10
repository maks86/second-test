package com.vk;

public class Manager extends Employee {
    private double rate;      //salary in month;
    private double time;         //number of hours per month laid on a flat rate.


    public Manager(String name,double rate,double time) {
        super(name);
        this.rate=rate;
        this.time=time;
    }

    public double calculateSalary(double timeInMonth) {
        double salary = timeInMonth * rate / time;
        System.out.println(getName() + " salary manager is " + salary);
        return salary;

    }

    @Override
    public double calculateSalary() {
        return 0;
    }
}
