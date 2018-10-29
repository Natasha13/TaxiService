package com.minarchenko.taxiService.entity;

public class Car extends TaxiEntity{

    private int seatingCapacity;

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public String toString() {
        return "Car " + super.toString()+
                ", eatingCapacity=" + seatingCapacity ;
    }

    public Car(String name, int speed, int value, double fuel,int seatingCapacity) {
        super(name, speed, value, fuel);
        this.seatingCapacity=seatingCapacity;
    }
}
