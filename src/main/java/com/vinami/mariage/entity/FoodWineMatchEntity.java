package com.vinami.mariage.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "food_wine_match")
@Getter
public class FoodWineMatchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "food_id")
    private int foodId;

    @Column(name = "wine_type_id")
    private int wineTypeId;

    @Column(name = "matching_score")
    private int matchingScore;
}
