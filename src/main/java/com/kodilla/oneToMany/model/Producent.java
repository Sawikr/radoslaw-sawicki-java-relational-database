package com.kodilla.oneToMany.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Producent")
public class Producent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String producentName;

    public Producent(String producentName) {
        this.producentName = producentName;
    }

    public Producent() {
    }
}