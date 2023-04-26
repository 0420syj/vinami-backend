package com.vinami.mariage.repository;

import com.vinami.mariage.entity.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<FoodEntity, Long> {
    public FoodEntity findByName(String name);
    public FoodEntity findByNameKorean(String nameKorean);

    public List<FoodEntity> findAll();
}

