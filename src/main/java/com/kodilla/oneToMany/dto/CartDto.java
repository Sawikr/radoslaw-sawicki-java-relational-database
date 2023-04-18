package com.kodilla.oneToMany.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CartDto implements Serializable {
    private final Long id;
    private final String name;
}
