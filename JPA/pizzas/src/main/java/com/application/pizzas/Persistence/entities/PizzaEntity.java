package com.application.pizzas.Persistence.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="pizza")
@Getter
@Setter
@NoArgsConstructor
@ToString

public class PizzaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Integer idPizza;

    @Column(nullable = false, length = 30, unique = true)  //no nombres iguales
    private String name;

    @Column(nullable = false, length = 100) 
    private String description;
    
    @Column(nullable = false, columnDefinition = "Decimal(5,2)") 
    private Double price;

    @Column(nullable = false) 
    private Integer available;
}
