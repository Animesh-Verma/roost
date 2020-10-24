package com.zb.foodmenuservice.models;

public class Food {

    private String foodId;
    private String name;
    private String description;

    public Food() {
    }

    public Food(String foodId, String name, String description) {
        this.foodId = foodId;
        this.name = name;
        this.description = description;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
