package com.project.megusta.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Contains {
    @EmbeddedId
    private ContainsKey containsId;

    @ManyToOne
    @JsonIgnore
    @MapsId("ingredient_id")
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient;

    @ManyToOne
    @JsonIgnore
    @MapsId("recipe_id")
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    private double quantity;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "unit_id")
    private Unit unit;

    public Contains() {

    }

    public Contains(Ingredient ingredient, Recipe recipe, double quantity, Unit unit) {
        this.ingredient = ingredient;
        this.recipe = recipe;
        this.quantity = quantity;
        this.unit = unit;
    }

    /**
     * @return the containsId
     */
    public ContainsKey getContainsId() {
        return containsId;
    }

    /**
     * @return the ingredient
     */
    public Ingredient getIngredient() {
        return ingredient;
    }

    /**
     * @return the quantity
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * @return the recipe
     */
    public Recipe getRecipe() {
        return recipe;
    }

    /**
     * @return the unit
     */
    public Unit getUnit() {
        return unit;
    }

    /**
     * @param containsId the containsId to set
     */
    public void setContainsId(ContainsKey containsId) {
        this.containsId = containsId;
    }

    /**
     * @param ingredient the ingredient to set
     */
    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    /**
     * @param recipe the recipe to set
     */
    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass().equals(this.getClass()) && ingredient.equals(((Contains) obj).ingredient)
                && recipe.equals(((Contains) obj).recipe);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
