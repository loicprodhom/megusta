package com.project.megusta.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "ingredients")
public interface IngredientRepository extends CrudRepository<Ingredient, Long> {
    List<Ingredient> findByName(String name);
}
