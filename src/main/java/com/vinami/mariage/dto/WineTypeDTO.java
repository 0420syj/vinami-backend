package com.vinami.mariage.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class WineTypeDTO {
    private final int id;
    private final String name;
    private final String nameKorean;
}
