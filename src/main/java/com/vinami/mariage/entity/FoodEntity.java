package com.vinami.mariage.entity;


import com.vinami.mariage.dto.FoodDTO;
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

    public FoodDTO convertToDTO() {
        return new FoodDTO(this.name, this.nameKorean);
    }
}
