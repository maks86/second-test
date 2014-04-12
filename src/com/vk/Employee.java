package com.vk;

public abstract class Employee {
    private String name;
    private String specialty;

    public Employee(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
       return specialty;
    }

    public abstract double calculateSalary();
}
