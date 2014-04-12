package com.vk;

public class Bookkeeper extends Employee {
    private double salary;

    public Bookkeeper(String name, double salary) {
        super(name);
        this.salary = salary;
    }
    @Override
    public double calculateSalary() {
        System.out.println(getName()+" bookkeeper with a salary:" + salary);
        return salary;
    }

    public double calculateSalaryForEmployees(Employee[] employees) {
        for (Employee ex : employees) {
            ex.calculateSalary();
        }
        return salary;
    }
}