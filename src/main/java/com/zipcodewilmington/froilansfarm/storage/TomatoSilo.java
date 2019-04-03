package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.producers.produce.Corn;
import com.zipcodewilmington.froilansfarm.producers.produce.Crop;
import com.zipcodewilmington.froilansfarm.producers.produce.Tomato;

public class TomatoSilo implements Storage<Tomato> {
    public Integer numberOfTomatoes;

    public TomatoSilo(){
        this.numberOfTomatoes = 0;
    }

    public TomatoSilo(Integer numberOfTomatoes){
        this.numberOfTomatoes = numberOfTomatoes;
    }

    public Integer getNumberOfTomatoes(){
        return numberOfTomatoes;
    }

    public void setNumberOfTomatoes(Integer numberOfTomatoes){
        this.numberOfTomatoes = numberOfTomatoes;
    }

    public void add(Tomato storageObject) {
        numberOfTomatoes = numberOfTomatoes + 1;
    }
}
