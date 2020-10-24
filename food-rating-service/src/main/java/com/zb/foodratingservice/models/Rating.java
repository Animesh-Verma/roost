package com.zb.foodratingservice.models;

public class Rating {

    private String foodId;
    private int rating;

    public Rating(String foodId, int rating) {
        this.foodId = foodId;
        this.rating = rating;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
