package org.launchcode.mealplanner.controllers;


import org.launchcode.mealplanner.models.Ingredient;
import org.launchcode.mealplanner.models.data.IngredientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;


@Controller
@RequestMapping("ingredient")
public class IngredientController {

    @Autowired
    private IngredientDao ingredientDao;

    @RequestMapping(value = "")
    public String index( Model model) {

        model.addAttribute("ingredients", ingredientDao.findAll());
        model.addAttribute("title", "Available Ingredients");

        return "ingredient/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddIngredientForm(Model model) {
        model.addAttribute("title", "Add New Ingredient");
        model.addAttribute(new Ingredient());

        return "ingredient/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddIngredientForm(@ModelAttribute @Valid Ingredient newIngredient, Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add New Ingredient");
            return "ingredient/add";
        }

        ingredientDao.save(newIngredient);
        newIngredient.calculateTotalFat();
        newIngredient.calculateNetCarbohydrate();
        return "redirect:";
    }
}
