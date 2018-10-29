package com.minarchenko.taxiService.view;

import com.minarchenko.taxiService.entity.TaxiEntity;

import java.util.List;

public class TaxiView {
    public static void printTaxi(List<TaxiEntity> taxiEntities){
        for (TaxiEntity taxiEntity : taxiEntities) {
            System.out.println(taxiEntity);
        }
    }
}
