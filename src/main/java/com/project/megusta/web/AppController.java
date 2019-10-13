package com.project.megusta.web;

import java.util.List;

import com.project.megusta.domain.ContainsRepository;
import com.project.megusta.domain.Ingredient;
import com.project.megusta.domain.IngredientRepository;
import com.project.megusta.domain.RecipeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
    @Autowired
    private RecipeRepository recipeRepository;

    @Autowired
    private ContainsRepository containsRepository;

    @Autowired
    private IngredientRepository ingredientRepository;

    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public @ResponseBody List<Ingredient> ingredientRest() {
        return (List<Ingredient>) ingredientRepository.findAll();
    }
}
