package com.vinami.mariage.entity;


import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "foods")
@Getter
public class FoodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "name_korean")
    private String nameKorean;
}
