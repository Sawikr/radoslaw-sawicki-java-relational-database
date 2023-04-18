package com.kodilla.oneToMany.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String serial;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    public Item(String serial, Cart cart) {
        this.serial = serial;
        this.cart = cart;
    }

}