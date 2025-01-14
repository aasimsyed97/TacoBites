package com.TacoBites.repository;

import com.TacoBites.model.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


public class JDBCIngredientRepository implements IngredientRepository{

    private JdbcTemplate jdbc;

    @Autowired
    public JDBCIngredientRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    @Override
    public Iterable<Ingredient> findAll() {
        return null;
    }

    @Override
    public Ingredient findOne(String id) {
        return null;
    }

    @Override
    public Ingredient save(Ingredient ingredient) {
        return null;
    }
}
