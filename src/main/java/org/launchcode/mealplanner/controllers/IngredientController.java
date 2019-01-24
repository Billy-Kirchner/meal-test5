package org.launchcode.mealplanner.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("ingredient")
public class IngredientController {

    @RequestMapping(value ="")
    @ResponseBody
    public String index () {
        return "Ingredients go here!";
    }
}
