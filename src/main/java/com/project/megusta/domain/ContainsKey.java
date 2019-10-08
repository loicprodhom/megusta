package com.project.megusta.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ContainsKey implements Serializable {
    @Column(name = "recipe_id")
    private Long recipeId;

    @Column(name = "ingredient_id")
    private Long ingredientId;

    /**
     * @return the ingredientId
     */
    public Long getIngredientId() {
        return ingredientId;
    }

    /**
     * @return the recipeId
     */
    public Long getRecipeId() {
        return recipeId;
    }

    /**
     * @param ingredientId the ingredientId to set
     */
    public void setIngredientId(Long ingredientId) {
        this.ingredientId = ingredientId;
    }

    /**
     * @param recipeId the recipeId to set
     */
    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    @Override
    public boolean equals(Object obj) {
        return ingredientId.equals(((ContainsKey) obj).ingredientId) && recipeId.equals(((ContainsKey) obj).recipeId);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
