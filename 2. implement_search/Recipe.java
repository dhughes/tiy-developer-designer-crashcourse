package com.example.entity;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private Integer id;
    private String title;
    private String imageUrl;
    private String description;
    private Integer servings;
  private List<Ingredient> ingredients = new ArrayList<>();
  private List<Instruction> instructions = new ArrayList<>();

    public Recipe(int id, String title, String imageUrl, String description, int servings) {
        this.id = id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.description = description;
        this.servings = servings;
    }

    public Recipe(int id, String title, String imageUrl, String description, int servings, List<Ingredient> ingredients, List<Instruction> instructions) {

        this.id = id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.description = description;
        this.servings = servings;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

  public Recipe(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<Instruction> instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", description='" + description + '\'' +
                ", servings=" + servings +
                ", ingredients=" + ingredients +
                ", instructions=" + instructions +
                '}';
    }
}