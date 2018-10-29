package com.minarchenko.taxiService;

import com.minarchenko.taxiService.dataSource.DataSource;
import com.minarchenko.taxiService.service.TaxiService;
import com.minarchenko.taxiService.entity.Car;
import com.minarchenko.taxiService.entity.TaxiEntity;
import com.minarchenko.taxiService.entity.Truck;
import com.minarchenko.taxiService.view.TaxiView;

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

        System.out.println();
        TaxiView.printTaxi(taxiEntities);

        System.out.println("");
        System.out.println("Sum = "+ TaxiService.sumValue(taxiEntities));

        System.out.println();


        TaxiView.printTaxi(TaxiService.sortFuel(taxiEntities));

        System.out.println();
        System.out.println("Speed between 120 and 150");
        TaxiView.printTaxi(TaxiService.speedRange(taxiEntities,120,150));
    }
}