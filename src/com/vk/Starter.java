/*Создать абстрактный класс сотрудник. У него должны быть методы для задания ставки, количества отработанных часов,
а также методы для получения процента отработанного времени и зарплаты за месяц.Сотрудники могут быть двух типов:
программист и менеджер. Программист получает зарплату в соответствии с количеством отработанных часов, а менеджер
- 100% в случае переработки и соответствующий процент в случае недоработки.
Для класса Бухгалтер должно быть прозрачным, какого типа является сотрудник. Ему важна только зарплата за текущий месяц.*/
package com.vk;

public class Starter {
    public static void main(String[] args) {
        Manager manager = new Manager("Maks Shkvirya", 2000, 160, 120);
        Programmer programmer = new Programmer("Max Mukhanov", 120, 30);
        Bookkeeper bookkeeper = new Bookkeeper("Elena Kopceva ", 2000);

        Employee[] employees = new Employee[3];
        employees[0] = manager;
        employees[1] = programmer;
        employees[2] = bookkeeper;

        for (Employee e : employees) {
            e.calculateSalary();
        }
        System.out.println("-----------------------------");
        bookkeeper.calculateSalaryForEmployees(employees);

    }
}



