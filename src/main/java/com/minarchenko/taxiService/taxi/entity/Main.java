package com.minarchenko.taxiService.taxi.entity;

import com.minarchenko.taxiService.DataSource;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvFileCar = "C:/NATA/Java/Courses/EPAM/TaxiService/src/main/resources/cars.csv";
        String csvFileTruck = "C:/NATA/Java/Courses/EPAM/TaxiService/src/main/resources/truck.csv";

        DataSource dataSource = new DataSource();
        List<Car> allCars = dataSource.getCars(csvFileCar);
        List<Truck> allTrucks = dataSource.getTrucks(csvFileTruck);
        List<TaxiEntity> taxiEntities=new ArrayList<>();
        taxiEntities.addAll(allCars);
        taxiEntities.addAll(allTrucks);

        int taxiValueSum=0;

        for (Truck allTruck : allTrucks) {
            System.out.println(allTruck);
            taxiValueSum=taxiValueSum+allTruck.getValue();
        }

        for (Car allCar : allCars) {
            System.out.println(allCar);
            taxiValueSum=taxiValueSum+allCar.getValue();
        }

        System.out.println();
        for (TaxiEntity taxiEntity: taxiEntities) {
            System.out.println(taxiEntity);
        }

        System.out.println("");
        System.out.println("Sum = "+taxiValueSum);

        System.out.println();

        for (TaxiEntity taxiEntity: TaxiService.sortFuel(taxiEntities)) {
            System.out.println(taxiEntity);
        }

        System.out.println();
        System.out.println("Speed between 120 and 150");
        for (TaxiEntity taxiEntity: TaxiService.speedRange(taxiEntities,120,150)) {
            System.out.println(taxiEntity);
        }
    }
}