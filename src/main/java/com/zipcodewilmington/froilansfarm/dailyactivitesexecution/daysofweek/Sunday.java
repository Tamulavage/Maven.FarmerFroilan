package com.zipcodewilmington.froilansfarm.dailyactivitesexecution.daysofweek;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.dailyactivitesexecution.DayInterface;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.CornStalk;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.PumpkinPlant;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.TomatoPlant;
import com.zipcodewilmington.froilansfarm.storage.CropRows;
import com.zipcodewilmington.froilansfarm.storage.Farmhouse;
import com.zipcodewilmington.froilansfarm.storage.Field;

import java.util.ArrayList;

public class Sunday implements DayInterface {
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


        // issue - no farmer called out here, just the field adds the crop rows
        Field field = this.FarmInstance.getField();

        CropRows pumpkinPlant = new CropRows();
        pumpkinPlant.add(new PumpkinPlant());
        field.add(pumpkinPlant);

        CropRows cornStalk = new CropRows();
        cornStalk.add(new CornStalk());
        field.add(cornStalk);

        CropRows tomatoPlant = new CropRows();
        tomatoPlant.add(new TomatoPlant());
        field.add(tomatoPlant);

    }
}
