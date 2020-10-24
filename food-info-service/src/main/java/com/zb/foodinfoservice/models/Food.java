package com.zb.foodinfoservice.models;

public class Food {
    private String foodId;
    private String name;

    public Food(String foodId, String name) {
        this.foodId = foodId;
        this.name = name;
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
}
