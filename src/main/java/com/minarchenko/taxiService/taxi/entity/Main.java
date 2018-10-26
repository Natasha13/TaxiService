package com.minarchenko.taxiService.taxi.entity;

import com.minarchenko.taxiService.DataSource;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvFileCar = "C:/NATA/Java/Courses/EPAM/TaxiService/src/main/resources/cars.csv";
        String csvFileTruck = "C:/NATA/Java/Courses/EPAM/TaxiService/src/main/resources/truck.csv";
        DataSource obj = new DataSource();
        List<Car> allCars = obj.getCars(csvFileCar);
        List<Truck> allTrucks = obj.getTrucks(csvFileTruck);
        for (Truck allTruck : allTrucks) {
            System.out.println(allTruck);
        }
        for (Car allCar : allCars) {
            System.out.println(allCar);
        }
    }
}