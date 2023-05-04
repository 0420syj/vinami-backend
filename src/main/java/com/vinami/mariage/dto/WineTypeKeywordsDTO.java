package com.vinami.mariage.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class WineTypeKeywordsDTO {
    private final int wineTypeId;
    private final String keywords;
    private final String keywordsKorean;
}
