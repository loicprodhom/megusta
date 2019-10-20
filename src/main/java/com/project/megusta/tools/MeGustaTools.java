package com.project.megusta.tools;

import java.util.ArrayList;
import java.util.List;

import com.project.megusta.domain.*;

public class MeGustaTools {
    public static void initializeEnvironment(IngredientRepository ingredientRepository,
            RecipeRepository recipeRepository, ContainsRepository containsRepository, UnitRepository unitRepository) {
        unitRepository.deleteAll();
        ingredientRepository.deleteAll();
        recipeRepository.deleteAll();
        containsRepository.deleteAll();

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
        ingredientRepository.save(new Ingredient("Pesto"));
        ingredientRepository.save(new Ingredient("Spaghetti"));

        Recipe pestoPasta = new Recipe("Pesto Pasta");
        recipeRepository.save(pestoPasta);
        List<Contains> contents = new ArrayList<Contains>();
        Contains pestoContent = new Contains((Ingredient) ingredientRepository.findByName("Pesto"), pestoPasta, 6,
                (Unit) unitRepository.findByName("Teaspoon"));
        contents.add(pestoContent);
        Contains pastaContent = new Contains((Ingredient) ingredientRepository.findByName("Spaghetti"), pestoPasta, 500,
                (Unit) unitRepository.findByName("Gram"));
        contents.add(pastaContent);
        pestoPasta.setIngredients(contents);
        recipeRepository.save(pestoPasta);

    }
}
