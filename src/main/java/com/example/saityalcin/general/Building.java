package com.example.saityalcin.general;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Building {
    Double price;
    Double area;
    Long numberOfRooms;
    Long numberOfSaloons;
}
