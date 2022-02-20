package com.example.springbootdemo.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "people")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Name shouldn't be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 letters")
    @Column(name = "name")
    private String name;

    @NotEmpty(message = "Surname shouldn't be empty")
    @Column(name = "surname")
    private String surname;

    @NotEmpty(message = "City shouldn't be empty")
    @Column(name = "hometown")
    private String city;

    @Min(value = 0, message = "Age should be more than 0")
    @Max(value = 130, message = "Age can't be more than 130")
    @Column(name = "age")
    private int age;

    public User(String name, String surname, String city, int age) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
    }

    public User() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }
}
