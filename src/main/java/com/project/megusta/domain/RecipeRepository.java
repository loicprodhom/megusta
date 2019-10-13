package com.project.megusta.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    public List<Recipe> findByName(String name);
}
