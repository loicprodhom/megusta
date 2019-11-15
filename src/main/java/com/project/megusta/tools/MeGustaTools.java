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

        Unit litre = new Unit("Litre", "L");
        unitRepository.save(litre);
        unitRepository.save(new Unit("Centilitre", "cL"));
        unitRepository.save(new Unit("Millilitre", "mL"));
        unitRepository.save(new Unit("Kilogram", "Kg"));
        Unit gram = new Unit("Gram", "g");
        unitRepository.save(gram);
        Unit teaspoon = new Unit("Teaspoon", "tsp");
        unitRepository.save(teaspoon);
        Unit tablespoon = new Unit("Tablespoon", "tbsp");
        unitRepository.save(tablespoon);
        Unit cup = new Unit("Cup", "c");
        unitRepository.save(cup);
        Unit piece = new Unit("Piece", "");
        unitRepository.save(piece);

        Ingredient garlic = new Ingredient("Garlic");
        Ingredient salt = new Ingredient("Salt");
        Ingredient pepper = new Ingredient("Pepper");
        Ingredient pesto = new Ingredient("Pesto");
        Ingredient onion = new Ingredient("Onion");
        Ingredient milk = new Ingredient("Milk");
        Ingredient egg = new Ingredient("Egg");
        Ingredient spaghetti = new Ingredient("Spaghetti");
        Ingredient pecorino = new Ingredient("Pecorino Romano");
        Ingredient oliveOil = new Ingredient("Olive Oil");
        Ingredient butter = new Ingredient("Butter");
        Ingredient bacon = new Ingredient("Bacon");

        ingredientRepository.save(garlic);
        ingredientRepository.save(salt);
        ingredientRepository.save(pepper);
        ingredientRepository.save(pesto);
        ingredientRepository.save(onion);
        ingredientRepository.save(milk);
        ingredientRepository.save(egg);
        ingredientRepository.save(spaghetti);
        ingredientRepository.save(pecorino);
        ingredientRepository.save(oliveOil);
        ingredientRepository.save(butter);
        ingredientRepository.save(bacon);

        // Persisting the recipe "Pesto Pasta"
        Recipe pestoPasta = new Recipe("Pesto Pasta",
                "Boil the pasta for about 7 minutes\nDrain the pasta when done\nAdd the pesto sauce");
        recipeRepository.save(pestoPasta);
        // !! using the respective repository's findByName method in command line runner
        // raises WARNING: An illegal reflective access operation has occurred
        // using variables instead
        pestoPasta.addContent(pesto, 6.0, teaspoon);
        pestoPasta.addContent(spaghetti, 500, gram);
        recipeRepository.save(pestoPasta);

        // Persisting the recipe "Spaghetti alla Carbonara"
        Recipe carbonara = new Recipe("Spaghetti alla Carbonara",
                new StringBuilder().append("Mix 4 egg yolks, 2 whole eggs, salt, pepper and pecorino in a bowl\n")
                        .append("Melt the butter in a hot pan, then add the crushed garlic and bacon\n")
                        .append("Boil the pasta for about 6 minutes\n")
                        .append("Cook the bacon to a crisp in salt and pepper\n")
                        .append("Add the pasta in the pan with two tablespoons of pasta cooking water\n")
                        .append("Mix for about a minute, then take the pan off the heat for a minute\n")
                        .append("Pour the egg and pecorino sauce in the pan. Mix and serve.\n").toString());
        recipeRepository.save(carbonara);
        carbonara.addContent(egg, 6, piece);
        carbonara.addContent(garlic, 2, piece);
        carbonara.addContent(pepper, 50, gram);
        carbonara.addContent(salt, 50, gram);
        carbonara.addContent(bacon, 300, gram);
        carbonara.addContent(pecorino, 200, gram);
        carbonara.addContent(spaghetti, 500, gram);
        carbonara.addContent(butter, 200, gram);

        recipeRepository.save(carbonara);

    }
}
