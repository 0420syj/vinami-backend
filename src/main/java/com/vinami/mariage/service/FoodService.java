package com.vinami.mariage.service;

import com.vinami.mariage.entity.FoodEntity;
import com.vinami.mariage.repository.FoodRepository;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public String findByFoodName(String name) {
        FoodEntity foodEntity = foodRepository.findByName(name);
        String foodInfo;
        foodInfo = foodEntity.getName() + " : " + foodEntity.getNameKorean();
        return foodInfo;
    }

    public String findByFoodNameKorean(String nameKorean) {
        FoodEntity foodEntity = foodRepository.findByNameKorean(nameKorean);
        String foodInfo;
        foodInfo = foodEntity.getName() + " : " + foodEntity.getNameKorean();
        return foodInfo;
    }
}
