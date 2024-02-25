package com.example.saityalcin.service;

import com.example.saityalcin.entity.House;
import com.example.saityalcin.entity.SummerHouse;
import com.example.saityalcin.entity.Villa;
import com.example.saityalcin.general.Building;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EntityService {
    List<Building> list = new ArrayList<>();

    public EntityService() {
        list.addAll(initHouses());
        list.addAll(initVillas());
        list.addAll(initSummerHouses());
    }

    private List<House> initHouses() {
        House house1 = new House(250000.0, 150.0, 3L, 2L);
        House house2 = new House(350000.0, 200.0, 4L, 3L);
        House house3 = new House(500000.0, 300.0, 5L, 4L);

        List<House> houseList = new ArrayList<>();

        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);

        return houseList;
    }

    private List<Villa> initVillas() {
        List<Villa> villaList = new ArrayList<>();
        Villa villa = new Villa(350000.0, 200.0, 4L, 3L);
        villaList.add(villa);

        villa = new Villa(500000.0, 300.0, 5L, 4L);
        villaList.add(villa);

        villa = new Villa(700000.0, 400.0, 6L, 5L);
        villaList.add(villa);

        return villaList;
    }

    private List<SummerHouse> initSummerHouses() {
        List<SummerHouse> summerHouses = new ArrayList<>();

        SummerHouse summerHouse = new SummerHouse(98000.0, 150.0, 3L, 2L);
        summerHouses.add(summerHouse);

        summerHouse = new SummerHouse(133000.0, 200.0, 4L, 3L);
        summerHouses.add(summerHouse);

        summerHouse = new SummerHouse(70000.0, 300.0, 5L, 4L);
        summerHouses.add(summerHouse);

        return summerHouses;
    }


    public Double getTotalPriceOfAll() {
        Double totalPrice = 0.0;
        for (Building element : list) {
            totalPrice += element.getPrice();
        }
        return totalPrice;
    }

    public Double getTotalPriceOfHouses() {
        List<Building> list = this.list.stream().filter(element -> element instanceof House).toList();
        Double totalPrice = 0.0;

        for (Building element : list) {
            totalPrice += element.getPrice();
        }
        return totalPrice;
    }

    public Double getTotalPriceOfVillas() {
        List<Building> list = this.list.stream().filter(element -> element instanceof Villa).toList();
        Double totalPrice = 0.0;

        for (Building element : list) {
            totalPrice += element.getPrice();
        }
        return totalPrice;
    }

    public Double getTotalPriceOfSummerHouses() {
        List<Building> list = this.list.stream().filter(element -> element instanceof SummerHouse).toList();
        Double totalPrice = 0.0;

        for (Building element : list) {
            totalPrice += element.getPrice();
        }
        return totalPrice;
    }

    public Double getAverageAreaOfHouses() {
        List<Building> list = this.list.stream().filter(element -> element instanceof House).toList();
        Double totalArea = 0.0;

        for (Building element : list) {
            totalArea += element.getArea();
        }
        return totalArea / list.size();
    }

    public Double getAverageAreaOfVillas() {
        List<Building> list = this.list.stream().filter(element -> element instanceof Villa).toList();
        Double totalArea = 0.0;

        for (Building element : list) {
            totalArea += element.getArea();
        }
        return totalArea / list.size();
    }

    public Double getAverageAreaOfSummerHouses() {
        List<Building> list = this.list.stream().filter(element -> element instanceof SummerHouse).toList();
        Double totalArea = 0.0;

        for (Building element : list) {
            totalArea += element.getArea();
        }
        return totalArea / list.size();
    }

    public Double getAverageAreaOfAll() {
        Double totalArea = 0.0;

        for (Building element : list) {
            totalArea += element.getArea();
        }
        return totalArea / list.size();
    }

    public List<Building> filterByNumberOfRoomsAndSaloons(Long numberOfRooms, Long numberOfSaloons){
        return list.stream().filter(element -> element.getNumberOfRooms() == numberOfRooms && element.getNumberOfSaloons() == numberOfSaloons).collect(Collectors.toList());
    }
}