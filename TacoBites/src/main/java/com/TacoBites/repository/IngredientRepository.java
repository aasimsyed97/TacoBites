package com.TacoBites.repository;


import com.TacoBites.model.Ingredient;

public interface IngredientRepository {


    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}
