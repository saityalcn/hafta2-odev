package com.example.saityalcin.entity;

import com.example.saityalcin.general.Building;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
public class House extends Building {

    public House(Double price, Double area, Long numberOfRooms, Long numberOfSaloons) {
        super(price, area, numberOfRooms, numberOfSaloons);
    }
}
