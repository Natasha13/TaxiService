package com.minarchenko.taxiService.taxi.entity;

/**
 * Created by Nataliia on 24.10.2018.
 */
public class Truck extends TaxiEntity{
private int payloadCapacity;

    public int getPayloadCapacity() {
        return payloadCapacity;
    }

    public Truck (String name, int speed, int value, double fuel,int payloadCapacity) {
        super(name, speed, value, fuel);
        this.payloadCapacity= payloadCapacity;
    }

    @Override
    public String toString() {
        return "Truck " + super.toString()+" {payloadCapacity=" + payloadCapacity +
                "} " ;
    }
}
