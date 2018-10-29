package com.minarchenko.taxiService.entity;

public class TaxiEntity {
    private String name;
    private int speed;
    private int value;
    private double fuel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public TaxiEntity(String name, int speed, int value, double fuel) {
        this.name = name;
        this.speed = speed;
        this.value = value;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "name='" + name +
                ", speed=" + speed +
                ", value=" + value +
                ", fuel=" + fuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaxiEntity that = (TaxiEntity) o;

        if (speed != that.speed) return false;
        if (value != that.value) return false;
        if (Double.compare(that.fuel, fuel) != 0) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + speed;
        result = 31 * result + value;
        temp = Double.doubleToLongBits(fuel);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
