package com.vinami.mariage.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "wine_type_keywords")
@Getter
public class WineTypeKeywordsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "wine_type_id")
    private int wineTypeId;

    @Column(name = "keywords")
    private String keywords;

    @Column(name = "keywords_korean")
    private String keywordsKorean;
}
