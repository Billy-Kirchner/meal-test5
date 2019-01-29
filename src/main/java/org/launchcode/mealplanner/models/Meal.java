package org.launchcode.mealplanner.models;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


import javax.persistence.GeneratedValue;
import javax.validation.constraints.Size;
import java.util.*;

@Entity
public class Meal {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=30,message= "Name must be between 3 and 30 characters")
    private String name;

//    private HashMap<Ingredient, Double> components = new HashMap<>();

    private double calories;
    private double saturatedFat;
    private double polyUnsaturatedFat;
    private double monoUnsaturatedFat;
    private double transFat;
    private double totalFat;
    private double cholesterol;
    private double sodium;
    private double potassium;
    private double totalCarbohydrate;
    private double dietaryFiber;
    private double sugar;
    private double netCarbohydrate;
    private double protein;

    @ManyToMany
    private List<Ingredient> ingredients;

    @ManyToMany(mappedBy = "meals")
    private List<Day> days;

    public Meal (String name) {
        this.name = name;

    }

    public Meal () {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/*    public HashMap<Ingredient, Double> getComponents() {
        return components;
    }

    public void setComponents(HashMap<Ingredient, Double> components) {
        this.components = components;
    }*/

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public int getId() {
        return id;
    }

    public double getCalories() {
        return calories;
    }

    public double getSaturatedFat() {
        return saturatedFat;
    }

    public double getPolyUnsaturatedFat() {
        return polyUnsaturatedFat;
    }

    public double getMonoUnsaturatedFat() {
        return monoUnsaturatedFat;
    }

    public double getTransFat() {
        return transFat;
    }

    public double getTotalFat() {
        return totalFat;
    }

    public double getCholesterol() {
        return cholesterol;
    }

    public double getSodium() {
        return sodium;
    }

    public double getPotassium() {
        return potassium;
    }

    public double getTotalCarbohydrate() {
        return totalCarbohydrate;
    }

    public double getDietaryFiber() {
        return dietaryFiber;
    }

    public double getSugar() {
        return sugar;
    }

    public double getNetCarbohydrate() {
        return netCarbohydrate;
    }

    public double getProtein() {
        return protein;
    }

/*    public void addComponent (Ingredient ingredient, Double servings) {
        components.put(ingredient, servings);
   }*/

    public void addIngredient (Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void calculateTotals () {
        calories = 0;
        saturatedFat = 0;
        polyUnsaturatedFat = 0;
        monoUnsaturatedFat = 0;
        transFat = 0;
        totalFat = 0;
        cholesterol = 0;
        sodium = 0;
        potassium = 0;
        totalCarbohydrate = 0;
        dietaryFiber = 0;
        sugar = 0;
        netCarbohydrate = 0;
        protein = 0;

        for( Ingredient ingredient : ingredients) {
            calories += ingredient.getCalories();
            saturatedFat += ingredient.getSaturatedFat();
            polyUnsaturatedFat += ingredient.getPolyUnsaturatedFat();
            monoUnsaturatedFat += ingredient.getMonoUnsaturatedFat();
            transFat += ingredient.getTransFat();
            totalFat += ingredient.getTotalFat();
            cholesterol += ingredient.getCholesterol();
            sodium += ingredient.getSodium();
            potassium += ingredient.getPotassium();
            totalCarbohydrate += ingredient.getTotalCarbohydrate();
            dietaryFiber += ingredient.getDietaryFiber();
            sugar += ingredient.getSugar();
            netCarbohydrate += ingredient.getNetCarbohydrate();
            protein += ingredient.getProtein();
        }

/*        Iterator it = components.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            calories += (pair.getKey().getCalories * pair.getValue());
            saturatedFat += (pair.getKey().getSaturatedFat * pair.getValue());
        }*/


    }
}
