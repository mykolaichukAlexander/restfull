package com.restfull.restfull;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@RequiredArgsConstructor
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String role;

    Employee(String name, String role){
        this.name = name;
        this.role = role;
    }
}
