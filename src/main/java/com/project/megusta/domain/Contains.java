package com.project.megusta.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Contains {
    @EmbeddedId
    private ContainsKey containsId;

    @ManyToOne
    @MapsId("ingredient_id")
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient;

    @ManyToOne
    @MapsId("recipe_id")
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    private double quantity;

    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Unit unit;
}
