package com.vinami.mariage.dto;

import com.vinami.mariage.entity.FoodEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class FoodDTO {
    private final String name;
    private final String nameKorean;

    @Override
    public String toString() {
        return name + " : " + nameKorean;
    }
}
