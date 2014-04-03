package com.vk;

abstract class Employee {
    private String name;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getDescription();

}
