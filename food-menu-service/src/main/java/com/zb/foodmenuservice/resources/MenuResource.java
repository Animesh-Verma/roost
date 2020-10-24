package com.zb.foodmenuservice.resources;

import com.zb.foodmenuservice.models.Food;
import com.zb.foodmenuservice.models.MenuItem;
import com.zb.foodmenuservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/menu")
public class MenuResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public List<MenuItem> getMenu(@PathVariable("userId") String userId) {

        UserRating ratings = restTemplate.getForObject("http://food-rating-service/ratingsdata/user/" + userId, UserRating.class);

        return ratings.getRatings().stream().map(rating -> {
            Food food = restTemplate.getForObject("http://food-info-service/foods/" + rating.getFoodId(), Food.class);
            return new MenuItem(food.getName(), "test", rating.getRating());
        }).collect(Collectors.toList());

    }
}
