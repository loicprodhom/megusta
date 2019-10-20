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
        Unit teaspoon = new Unit("Teaspoon", "tsp");
        unitRepository.save(teaspoon);
        unitRepository.save(new Unit("Tablespoon", "tbsp"));
        unitRepository.save(new Unit("Cup", "c"));
        unitRepository.save(new Unit("Unit", "piece(s)"));

        ingredientRepository.save(new Ingredient("Garlic"));
        ingredientRepository.save(new Ingredient("Salt"));
        ingredientRepository.save(new Ingredient("Pepper"));
        ingredientRepository.save(new Ingredient("Onion"));
        ingredientRepository.save(new Ingredient("Milk"));
        ingredientRepository.save(new Ingredient("Egg"));
        Ingredient pesto = new Ingredient("Pesto");
        ingredientRepository.save(pesto);
        ingredientRepository.save(new Ingredient("Spaghetti"));

        // Persisting the recipe "Pesto Pasta"
        Recipe pestoPasta = new Recipe("Pesto Pasta");
        recipeRepository.save(pestoPasta);
        List<Contains> contents = new ArrayList<Contains>();
        Contains pestoContent = new Contains(pesto, pestoPasta, 6.0, teaspoon);
        contents.add(pestoContent);
        // Contains pastaContent = new
        // Contains((Ingredient) ingredientRepository.findByName("Spaghetti"), (Recipe)
        // recipeRepository.findByName("Pesto Pasta"), 500, (Unit)
        // unitRepository.findByName("Gram")); contents.add(pastaContent);
        // containsRepository.save(pastaContent); pestoPasta.setIngredients(contents);
        pestoPasta.setIngredients(contents);
        // recipeRepository.save(pestoPasta);

    }
}
