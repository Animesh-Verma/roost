package com.zb.foodinfoservice.resources;

import com.zb.foodinfoservice.models.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/foods")
public class FoodResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{foodId}")
    public Food getFoodInfo(@PathVariable("foodId") String foodId) {
        return new Food(foodId, "Food name");
    }

}


