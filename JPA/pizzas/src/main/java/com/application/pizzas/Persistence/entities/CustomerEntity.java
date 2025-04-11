package com.application.pizzas.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="customer")
@Getter
@Setter
@NoArgsConstructor
@ToString

public class CustomerEntity {

    @Id
    @Column(nullable = false)
    private int id;

    @Column(length = 30)
    private String name;

    @Column(length = 100) 
    private String address;

    @Column(nullable = false, length = 50) 
    private String email;

    @Column(length = 50)
    private String phonenumber;


    
}
