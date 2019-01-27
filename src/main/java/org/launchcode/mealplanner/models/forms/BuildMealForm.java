package org.launchcode.mealplanner.models.forms;

import org.launchcode.mealplanner.models.Ingredient;
import org.launchcode.mealplanner.models.Meal;

import javax.validation.constraints.NotNull;

public class BuildMealForm {

    private Meal meal;

    private Iterable<Ingredient> ingredients;

    private double servings;

    @NotNull
    private int mealId;

    @NotNull
    private int ingredientId;

    public BuildMealForm (Meal meal, Iterable<Ingredient> ingredients) {
        this.meal = meal;
        this.ingredients = ingredients;
    }

    public BuildMealForm () {

    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public Iterable<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Iterable<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public double getServings() {
        return servings;
    }

    public void setServings(double servings) {
        this.servings = servings;
    }
}
