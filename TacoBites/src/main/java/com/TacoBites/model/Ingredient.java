package com.TacoBites.model;


import lombok.Data;

@Data
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;


}