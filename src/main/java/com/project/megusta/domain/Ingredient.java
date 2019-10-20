package com.project.megusta.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ingredient_id")
    private Long ingredientId;

    @Column(name = "ingredient_name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ingredient")
    private List<Contains> recipes;

    public Ingredient() {

    }

    public Ingredient(String name) {
        this.name = name;
    }

    /**
     * @return the ingredientId
     */
    public Long getIngredientId() {
        return ingredientId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param ingredientId the ingredientId to set
     */
    public void setIngredientId(Long ingredientId) {
        this.ingredientId = ingredientId;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the recipes
     */
    public List<Contains> getRecipes() {
        return recipes;
    }

    /**
     * @param recipes the recipes to set
     */
    public void setRecipes(List<Contains> recipes) {
        this.recipes = recipes;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass().equals(this.getClass()) && ingredientId.equals(((Ingredient) obj).ingredientId)
                && name.equals(((Ingredient) obj).name);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
