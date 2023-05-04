package com.vinami.mariage.controller;

import com.vinami.mariage.service.FoodService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
@CrossOrigin(origins = "*", allowedHeaders = "*")
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

    @GetMapping("/all")
    public List<String> findAll() {
        return foodService.findAll();
    }
}
