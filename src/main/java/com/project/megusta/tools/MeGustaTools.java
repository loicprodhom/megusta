package com.project.megusta.tools;

import com.project.megusta.domain.*;

public class MeGustaTools {
    public static void initializeEnvironment(IngredientRepository ingredientRepository,
            RecipeRepository recipeRepository, ContainsRepository containsRepository, UnitRepository unitRepository) {
        unitRepository.save(new Unit("Litre", "L"));
        unitRepository.save(new Unit("Centilitre", "cL"));
        unitRepository.save(new Unit("Millilitre", "mL"));
        unitRepository.save(new Unit("Kilogram", "Kg"));
        unitRepository.save(new Unit("Gram", "g"));
        unitRepository.save(new Unit("Teaspoon", "tsp"));
        unitRepository.save(new Unit("Tablespoon", "tbsp"));
        unitRepository.save(new Unit("Cup", "c"));
        unitRepository.save(new Unit("Unit", "piece(s)"));

        ingredientRepository.save(new Ingredient("Garlic"));
        ingredientRepository.save(new Ingredient("Salt"));
        ingredientRepository.save(new Ingredient("Pepper"));
        ingredientRepository.save(new Ingredient("Onion"));
        ingredientRepository.save(new Ingredient("Milk"));
        ingredientRepository.save(new Ingredient("Egg"));
    }
}
