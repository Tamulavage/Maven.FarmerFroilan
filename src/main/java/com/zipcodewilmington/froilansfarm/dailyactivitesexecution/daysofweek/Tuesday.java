package com.zipcodewilmington.froilansfarm.dailyactivitesexecution.daysofweek;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.animals.people.Pilot;
import com.zipcodewilmington.froilansfarm.dailyactivitesexecution.DayInterface;
import com.zipcodewilmington.froilansfarm.storage.Farmhouse;
import com.zipcodewilmington.froilansfarm.storage.Field;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;

public class Tuesday implements DayInterface {

    private Farm FarmInstance;

    @Override
    public void doFarmWork(Farm farm) {
        this.FarmInstance = Farm.getInstance();

        // ride each horse
        // feed each horse
        //      3 ears of corn
        // froilan eats
        //     1 ear of corn
        //     2 Tomato
        //     5 egg
        // Fropilanda eats
        //   2 eear of corn
        //    1 tomato
        //    2 eggs

        // Froilan uses tractor
        //     harvest each crop in cropRow
        Farmhouse farmhouse = this.FarmInstance.getFarmhouse();
        Tractor tractor = this.FarmInstance.getTractor(0);
        Farmer farmer = farmhouse.getFarmerFromFarm();
        farmer.mount(tractor);
        Field field = this.FarmInstance.getField();
        Integer amountOfCropRows = field.getNumberOfCropRows();
        for(int i=0 ; i<amountOfCropRows; i++) {
       //     tractor.harvest(field.getCropRow(i));
        }
        tractor.exitVehicle();
    }
}
