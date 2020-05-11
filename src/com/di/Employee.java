package com.di;

public class Employee {
    private int age;
    private String name;

    public Employee(int age, String name) {
        this. age = age;
        this.name = name;
    }
    public void info() {
        System.out.println(age +" "+name);
    }
}
