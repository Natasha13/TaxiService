package com.minarchenko.taxiService.service;

import com.minarchenko.taxiService.entity.TaxiEntity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaxiService {
    public static double sumValue(List<TaxiEntity> taxiEntity) {
        int resultSum=0;
        for (TaxiEntity taxiEntity1 : taxiEntity) {
            resultSum = resultSum + taxiEntity1.getValue();
        }
        return resultSum;
    }

    public static List<TaxiEntity> sortFuel(List<TaxiEntity> taxiEntity){
        List<TaxiEntity> taxiEntity1=new ArrayList<>(taxiEntity);
        taxiEntity1.sort(Comparator.comparing(TaxiEntity::getFuel));
        return taxiEntity1;
    }

    public static List<TaxiEntity> speedRange(List<TaxiEntity> taxiEntity, double minValue, double maxValue){
        List<TaxiEntity> taxiEntityNew=new ArrayList<>();
        for (TaxiEntity taxiEntity1 : taxiEntity) {
          if(taxiEntity1.getSpeed()<maxValue&&taxiEntity1.getSpeed()>minValue){
              taxiEntityNew.add(taxiEntity1);
          }
        }
        return taxiEntityNew;
    }
}
