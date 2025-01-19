package com.TacoBites.repository;


import com.TacoBites.model.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
    Taco save(Taco design);
}