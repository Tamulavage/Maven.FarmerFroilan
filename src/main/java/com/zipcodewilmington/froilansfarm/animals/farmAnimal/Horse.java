package com.zipcodewilmington.froilansfarm.animals.farmAnimal;

import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.animals.Eater;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Edible;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Rideable;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Rider;
import com.zipcodewilmington.froilansfarm.producers.produce.ProduceInterface;

import java.util.HashMap;
import java.util.List;

public class Horse  extends Animal implements  Rideable {

    private Boolean hasBeenRiddenToday;

    public Horse(){
        hasBeenRiddenToday = false;
    }


    public String makeNoise() {
        return "Neigh!";
    }

    public void ride(Rider rider) {
        hasBeenRiddenToday = true;
    }


    public Boolean getHasBeenRiddenToday() {
        return hasBeenRiddenToday;
    }

    public void setHasBeenRiddenToday(Boolean hasBeenRiddenToday) {
        this.hasBeenRiddenToday = hasBeenRiddenToday;
    }
}
