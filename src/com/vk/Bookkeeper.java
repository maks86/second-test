package com.vk;

class Bookkeeper extends Employee {

    public Bookkeeper(String name) {
        super(name);
    }

    public String getDescription() {
        return " bookkeeper considers salary ";
    }
}