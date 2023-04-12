package com.vinami.mariage.service;

import com.vinami.mariage.entity.FoodEntity;
import com.vinami.mariage.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public FoodEntity findByFoodName(String name) {
        return foodRepository.findByName(name);
    }
}
