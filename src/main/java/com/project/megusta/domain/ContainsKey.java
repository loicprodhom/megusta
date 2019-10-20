package com.project.megusta.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

@Embeddable
public class ContainsKey implements Serializable {
    @Transient
    private static final long serialVersionUID = 1L;

    @Column(name = "recipe_id")
    private Long recipeId;

    @Column(name = "ingredient_id")
    private Long ingredientId;

    public ContainsKey() {

    }

    public ContainsKey(Long recipeId, Long ingredientId) {
        this.recipeId = recipeId;
        this.ingredientId = ingredientId;
    }

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
        return obj.getClass().equals(this.getClass()) && ingredientId.equals(((ContainsKey) obj).ingredientId)
                && recipeId.equals(((ContainsKey) obj).recipeId);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
