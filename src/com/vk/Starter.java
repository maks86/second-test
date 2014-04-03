package com.vk;

class Starter {
    public static void main(String[] args) {
        Manager manager = new Manager("Maks Shkvirya", 2000, 160);
        manager.setTimeInMonth(120);
        Programmer programmer = new Programmer("Max Mukhanov");
        programmer.setSalaryProgrammer(120, 30);

        Employee[] employee = new Employee[3];
        employee[0] = manager;
        employee[1] = programmer;
        employee[2] = new Bookkeeper("Elena Kopceva");


        for (Employee e : employee)
            System.out.println(e.getName() + e.getDescription()+e.salary );

    }
}
