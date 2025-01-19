package com.TacoBites.repository;


import com.TacoBites.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository  extends CrudRepository<Ingredient, String> {


    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}
