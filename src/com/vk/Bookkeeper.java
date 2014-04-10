package com.vk;

public class Bookkeeper extends Employee {
    private double salary;
    public Bookkeeper(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }
}