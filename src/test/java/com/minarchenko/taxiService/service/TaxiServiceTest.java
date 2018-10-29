package com.minarchenko.taxiService.service;

import com.minarchenko.taxiService.entity.Car;
import com.minarchenko.taxiService.entity.TaxiEntity;
import com.minarchenko.taxiService.entity.Truck;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Nataliia on 28.10.2018.
 */
public class TaxiServiceTest {

    List<TaxiEntity> taxiEntity;
    Car car;
    Car car1;
    Truck truck;

    @Before
    public void init(){
        car = new Car("KIA Ceed sv", 180, 11300, 5.5, 5);
        truck = new Truck("Citroen Berlingo", 161, 17690, 5.7, 727);
        car1 = new Car("Suzuki Vitara", 180, 16460, 7.1, 5);
        taxiEntity = Arrays.asList(  car1,truck,car);
    }



    @Test
    public void testSumValue() throws Exception {
        Assert.assertEquals(TaxiService.sumValue(taxiEntity),45450,0.1);
    }

    @Test
    public void testSortFuel() throws Exception {
            List<TaxiEntity> taxiFuelListResulting= Arrays.asList(  car, truck,car1);
        Assert.assertEquals(taxiFuelListResulting,TaxiService.sortFuel(taxiEntity));
    }

    @Test
    public void testSpeedRange() throws Exception {
        List<TaxiEntity> taxiSpeedListResulting= Arrays.asList(truck);
        Assert.assertEquals(taxiSpeedListResulting,TaxiService.speedRange(taxiEntity,150,170));
    }

}