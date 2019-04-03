package com.zipcodewilmington.froilansfarm.animals.people;

import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Rideable;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Rider;
import com.zipcodewilmington.froilansfarm.producers.produce.Crop;
import com.zipcodewilmington.froilansfarm.storage.CropRows;

import java.util.List;

public class Farmer extends Person implements Botanist, Rider {
    private String name;

    public Farmer(String name){
        this.name = name;
    }

    public Farmer(){
        this.name = "Froilan";
    }

    public String getName(){
        return name;
    }


    public void plant(Crop crop, CropRows cropRows) {
        List<Crop> cropList = cropRows.getCropList();
        cropList.add(crop);
    }

    public void mount(Rideable rideable ) {
        rideable.ride(this);
    }

}
