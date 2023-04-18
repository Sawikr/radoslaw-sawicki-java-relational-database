package com.kodilla.oneToMany.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class ItemDto implements Serializable {
    private final Long id;
    private final String serial;
}
