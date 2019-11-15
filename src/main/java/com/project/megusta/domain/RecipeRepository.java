package com.project.megusta.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "api/recipes")
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    public List<Recipe> findByName(String name);
}
