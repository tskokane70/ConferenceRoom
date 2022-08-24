package com.tskokane70.conferenceroom.Entities;

public class Employee extends BaseEntity {
    private String name;

    public Employee(Employee employee) {
        this(employee.getId(), employee.getName());
    }

    public Employee(String id, String name) {
        this(name);
        this.id = id;
    }
    
    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
