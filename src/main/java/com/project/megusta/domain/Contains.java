package com.project.megusta.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contains {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contains_id")
    private Long containsId;

    /*
     * Found out that adding the @JsonIgnore annotation would completely prevent
     * creation of new relations between entities
     */

    @ManyToOne
    @JoinColumn(nullable = true, columnDefinition = "integer", name = "ingredient_id")
    private Ingredient ingredient;

    @ManyToOne
    @JoinColumn(nullable = true, columnDefinition = "integer", name = "recipe_id")
    private Recipe recipe;

    private double quantity;

    @ManyToOne
    @JoinColumn(nullable = true, columnDefinition = "integer", name = "unit_id")
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
    public Long getContainsId() {
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
    public void setContainsId(Long containsId) {
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
