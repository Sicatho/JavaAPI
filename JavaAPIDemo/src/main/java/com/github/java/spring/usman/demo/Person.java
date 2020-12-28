package com.github.java.spring.usman.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table
public class Person {

    @Id
    private String name;
    private int age;
    private String profession;
    private String hobby;
}
