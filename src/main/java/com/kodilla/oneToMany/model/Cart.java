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
    @OneToOne
    @JoinColumn(name = "producent_id", referencedColumnName = "id")
    private Producent producent;

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "cart",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            orphanRemoval = true
    )
    private List<Item> itemList = new ArrayList<>();

    public Producent getProducent() {
        return producent;
    }

    public void setProducent(Producent producent) {
        this.producent = producent;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public Cart(String name, Producent producent) {
        this.name = name;
        this.producent = producent;
    }

    public Cart() {
    }
}
