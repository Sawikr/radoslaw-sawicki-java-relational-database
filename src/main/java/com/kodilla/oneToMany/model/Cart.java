package com.kodilla.oneToMany.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "Cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "cart",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            orphanRemoval = true
    )
    private List<Item> itemList = new ArrayList<>();

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public Cart(String name) {
        this.name = name;
    }

    public Cart() {
    }
}
