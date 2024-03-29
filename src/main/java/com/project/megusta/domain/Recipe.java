package com.project.megusta.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "recipe_id")
    private Long recipeId;

    @Column(name = "recipe_name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private List<Contains> ingredients;

    public Recipe() {
        ingredients = new ArrayList<Contains>();
    }

    public Recipe(String name) {
        this.name = name;
        this.ingredients = new ArrayList<Contains>();
    }

    public Recipe(String name, List<Contains> content) {
        this.name = name;
        this.ingredients = content;
    }

    /**
     * @return the recipeId
     */
    public Long getRecipeId() {
        return recipeId;
    }

    /**
     * @return the ingredients
     */
    public List<Contains> getIngredients() {
        return ingredients;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param recipeId the recipeId to set
     */
    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    /**
     * @param ingredients the ingredients to set
     */
    public void setIngredients(List<Contains> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Contains content) {
        this.ingredients.add(content);
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass().equals(this.getClass()) && recipeId.equals(((Recipe) obj).recipeId)
                && name.equals(((Recipe) obj).name);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void addContent(Ingredient ingredient, double quantity, Unit unit) {
        this.ingredients.add(new Contains(ingredient, this, quantity, unit));
    }
}
