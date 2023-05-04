package com.vinami.mariage.service;

import com.vinami.mariage.dto.FoodDTO;
import com.vinami.mariage.entity.FoodEntity;
import com.vinami.mariage.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public String findByFoodName(String name) {
        FoodEntity foodEntity = foodRepository.findByName(name);
        FoodDTO foodDTO = foodEntity.convertToDTO();
        return foodDTO.toString();
    }

    public String findByFoodNameKorean(String nameKorean) {
        FoodEntity foodEntity = foodRepository.findByNameKorean(nameKorean);
        FoodDTO foodDTO = foodEntity.convertToDTO();
        return foodDTO.toString();
    }

    public List<String> findAll() {
        List<FoodEntity> foodEntityList = foodRepository.findAll();
        return foodEntityList.stream()
                .map(FoodEntity::convertToDTO)
                .map(FoodDTO::getName)
                .collect(Collectors.toList());
    }
}
