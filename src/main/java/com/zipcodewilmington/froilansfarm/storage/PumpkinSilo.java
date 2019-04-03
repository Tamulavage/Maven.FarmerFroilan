package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.producers.produce.Pumpkin;
import com.zipcodewilmington.froilansfarm.producers.produce.Tomato;

public class PumpkinSilo implements Storage<Pumpkin> {
    public Integer numberOfPumpkins;

    public PumpkinSilo(){
        this.numberOfPumpkins = 0;
    }

    public PumpkinSilo(Integer numberOfPumpkins){
        this.numberOfPumpkins = numberOfPumpkins;
    }

    public Integer getNumberOfPumpkins(){
        return numberOfPumpkins;
    }

    public void setNumberOfPumpkins(Integer numberOfPumpkins){
        this.numberOfPumpkins = numberOfPumpkins;
    }

    public void add(Pumpkin storageObject) {
        numberOfPumpkins = numberOfPumpkins + 1;
    }
}
