package com.vinami.mariage.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class FoodWineMatchDTO {
    private final int foodId;
    private final int wineTypeId;
    private final int matchingScore;
}
