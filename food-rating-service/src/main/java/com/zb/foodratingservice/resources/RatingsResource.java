package com.zb.foodratingservice.resources;

import com.zb.foodratingservice.models.Rating;
import com.zb.foodratingservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/foods/{foodId}")
    public Rating getFoodRating(@PathVariable("foodId") String foodId) {
        return new Rating(foodId, 4);
    }

    @RequestMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
        UserRating userRating = new UserRating();
        userRating.initData(userId);
        return userRating;
    }

}
