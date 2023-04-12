package com.vinami.mariage.controller;

import com.vinami.mariage.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/foods")
public class FoodController {


    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/name")
    public String findByFoodName(String name) {
        return foodService.findByFoodName(name);
    }

    @GetMapping("/korean")
    public String findByFoodNameKorean(String nameKorean) {
        return foodService.findByFoodNameKorean(nameKorean);
    }
}
