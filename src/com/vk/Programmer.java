package com.vk;

class Programmer extends Employee {

    Programmer(String name) {
        super(name);
    }

    public void setSalaryProgrammer(double timeInMonth, double salaryConst) {
        salary = timeInMonth * salaryConst;
        System.out.println(getName() + " programmer earns is " + salary);
    }

    public String getDescription() {
        return " employee with a salary ";
    }
}
