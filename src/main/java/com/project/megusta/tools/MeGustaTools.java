package com.project.megusta.tools;

import com.project.megusta.business.Customer;
import com.project.megusta.business.CustomerRepository;
import com.project.megusta.domain.*;

public class MeGustaTools {
    public static void initializeEnvironment(IngredientRepository ingredientRepository,
            RecipeRepository recipeRepository, ContainsRepository containsRepository, UnitRepository unitRepository,
            CustomerRepository customerRepository) {
        unitRepository.deleteAll();
        ingredientRepository.deleteAll();
        recipeRepository.deleteAll();
        containsRepository.deleteAll();
        customerRepository.deleteAll();

        customerRepository.save(new Customer("user", "user"));
        customerRepository.save(new Customer("admin", "admin"));

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
        Ingredient chicken = new Ingredient("Chicken");
        Ingredient tomato = new Ingredient("Tomato");
        Ingredient mince = new Ingredient("Minced meat");
        Ingredient redWine = new Ingredient("Red Wine");
        Ingredient oregano = new Ingredient("Oregano");

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
        ingredientRepository.save(chicken);
        ingredientRepository.save(tomato);
        ingredientRepository.save(mince);
        ingredientRepository.save(redWine);
        ingredientRepository.save(oregano);

        // Persisting the recipe "Pesto Pasta"
        Recipe pestoPasta = new Recipe("Pesto Pasta");
        recipeRepository.save(pestoPasta);
        // !! using the respective repository's findByName method in command line runner
        // raises WARNING: An illegal reflective access operation has occurred
        // using variables instead
        pestoPasta.addContent(pesto, 6.0, teaspoon);
        pestoPasta.addContent(spaghetti, 500, gram);
        recipeRepository.save(pestoPasta);

        // Persisting the recipe "Spaghetti alla Carbonara"
        Recipe carbonara = new Recipe("Spaghetti alla Carbonara");
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

        // Persisting recipe bolognese
        Recipe bolognese = new Recipe("Ragu alla Bolognese");
        bolognese.addContent(mince, 300, gram);
        bolognese.addContent(tomato, 2, piece);
        bolognese.addContent(onion, 2, piece);
        bolognese.addContent(salt, 3, tablespoon);
        bolognese.addContent(pepper, 3, tablespoon);
        bolognese.addContent(redWine, 1.5, cup);
        bolognese.addContent(oliveOil, 2, tablespoon);
        bolognese.addContent(garlic, 2, piece);
        bolognese.addContent(oregano, 1, tablespoon);

        recipeRepository.save(bolognese);

    }
}
