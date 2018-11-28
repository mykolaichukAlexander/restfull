package com.restfull.restfull;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CUSTOMER_ORDER")
@RequiredArgsConstructor
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    private String description;
    private Status status;

    Order(String description, Status status) {

        this.description = description;
        this.status = status;
    }
}
