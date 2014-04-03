package com.vk;

class Manager extends Employee {
    private double rate;      //ставка в мес.
    public double time;         //колличество положенных часов в мес на фиксированную ставку.

    public Manager(String name, double rate, double time) {    //создаём метод считающий ЗП менеджера
        super(name);
        this.rate = rate;
        this.time = time;
    }

    public void setTimeInMonth(double timeInMonth) {
        salary = timeInMonth * rate / time;
        System.out.println(getName() + " salary manager is " + salary);
    }

    public String getDescription() {
        return " employee with a salary ";
    }

}
