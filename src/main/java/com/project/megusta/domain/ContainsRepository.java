package com.project.megusta.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ContainsRepository extends CrudRepository<Contains, ContainsKey> {
    public List<Contains> findByIngredient(Ingredient ingredient);

    public List<Contains> findByRecipe(Recipe recipe);
}
