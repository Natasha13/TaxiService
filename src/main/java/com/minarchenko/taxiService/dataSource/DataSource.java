package com.minarchenko.taxiService.dataSource;

import com.minarchenko.taxiService.entity.Car;
import com.minarchenko.taxiService.entity.Truck;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public List<Car> getCars(String csvFileCar) {
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        List<Car> cars = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(csvFileCar));
            while ((line = br.readLine()) != null) {
                String[] taxiOne = line.split(cvsSplitBy);

                String name = taxiOne[0];
                int speed = Integer.parseInt(taxiOne[1]);
                int value = Integer.parseInt(taxiOne[2]);
                double fuel = Double.parseDouble(taxiOne[3]);
                int seatingCapacity = Integer.parseInt(taxiOne[4]);
                Car car = new Car(name, speed, value, fuel, seatingCapacity);
                cars.add(car);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cars;
    }

    public List<Truck> getTrucks(String truckFileCar) {
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        List<Truck> trucks = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(truckFileCar));
            while ((line = br.readLine()) != null) {
                String[] taxiOne = line.split(cvsSplitBy);
                String name = taxiOne[0];
                int speed = Integer.parseInt(taxiOne[1]);
                int value = Integer.parseInt(taxiOne[2]);
                double fuel = Double.parseDouble(taxiOne[3]);
                int payloadCapacity = Integer.parseInt(taxiOne[4]);
                Truck truck = new Truck(name, speed, value, fuel, payloadCapacity);
                trucks.add(truck);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return trucks;
    }

}
