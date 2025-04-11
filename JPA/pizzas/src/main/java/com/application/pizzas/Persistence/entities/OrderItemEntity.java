package com.application.pizzas.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="customer")
@IdClass(OrderItemId.class)


public class OrderItemEntity {

    @Id
    @Column(nullable = false)
    private int id;

    @Id
    @Column(name="id_order", nullable=false)
    private int idOrder;

    @Column(name="id_pizza", nullable=false)
    private int idPizza;

    @Column(nullable = false, columnDefinition = "Deciman(2,1)")
    private Double quantity;

    @ManyToOne
    @JoinColumn(name="id_order", referencedColumnName = "id_order", insertable = false, updatable = false)
    private OrderEntity order;

    @OneToOne
    @JoinColumn(name="id_pizza", referencedColumnName = "id_pizza", insertable = false, updatable = false)
    private PizzaEntity pizza;

   

    
}
