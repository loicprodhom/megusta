package com.project.megusta.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "recipecontents")
public interface ContainsRepository extends CrudRepository<Contains, Long> {
    public List<Contains> findByIngredient(Ingredient ingredient);

    public List<Contains> findByRecipe(Recipe recipe);
}
