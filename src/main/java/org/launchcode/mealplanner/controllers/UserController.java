package org.launchcode.mealplanner.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class UserController {

    @RequestMapping(value="")
    public String home (Model model) {
        model.addAttribute("title", "Meal Planner");

        return "user/home";
    }

}
