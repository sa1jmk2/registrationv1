package com.api;

public class Employee {

    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }
}

