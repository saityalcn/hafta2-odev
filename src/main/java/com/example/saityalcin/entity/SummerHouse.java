package com.example.saityalcin.entity;

import com.example.saityalcin.general.Building;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class SummerHouse extends Building {
    public SummerHouse(Double price, Double area, Long numberOfRooms, Long numberOfSaloons) {
        super(price, area, numberOfRooms, numberOfSaloons);
    }
}
