package com.kodilla.oneToMany.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProducentDto implements Serializable {
    private final Long id;
    private final String producentName;
}
