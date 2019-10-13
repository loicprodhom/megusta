package com.project.megusta;

import com.project.megusta.domain.ContainsRepository;
import com.project.megusta.domain.IngredientRepository;
import com.project.megusta.domain.RecipeRepository;
import com.project.megusta.domain.UnitRepository;
import com.project.megusta.tools.MeGustaTools;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MegustaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MegustaApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(IngredientRepository ingredientRepository, RecipeRepository recipeRepository,
			ContainsRepository containsRepository, UnitRepository unitRepository) {
		return (args) -> {
			MeGustaTools.initializeEnvironment(ingredientRepository, recipeRepository, containsRepository,
					unitRepository);
		};
	}

}
