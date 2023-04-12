package com.vinami.mariage.controller;

import com.vinami.mariage.entity.FoodEntity;
import com.vinami.mariage.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    public FoodEntity findByFoodName(String name) {
        return foodService.findByFoodName(name);
    }
}
