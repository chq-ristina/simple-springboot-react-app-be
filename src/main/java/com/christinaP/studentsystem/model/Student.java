package com.christinaP.studentsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//entity is a lightweight persistence domain object
//an entity represents a table in a relational database & each instance corresponds to a row in that table
@Entity
public class Student {
    @Id //makes primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //helps auto increment values
    private int id;
    private String name;
    private String address;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
