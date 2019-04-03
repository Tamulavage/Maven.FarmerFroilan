package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Edible;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.NoiseMaker;

import java.util.HashMap;

public abstract class Animal implements Eater, NoiseMaker {

    private HashMap<Edible, Integer> foodEaten;

    public Animal(){
        this.foodEaten = new HashMap<Edible, Integer>();
    }

    public void eat(Edible edible) {
        Integer currentAmount = currentEatenAmount(edible);
        currentAmount++;
        foodEaten.put(edible, currentAmount);
    }

    public HashMap getFood() {
        return this.foodEaten;
    }

    private Integer currentEatenAmount(Edible food) {
        Integer retVal = 0;
        if (foodEaten.get(food) != null) {
            retVal = foodEaten.get(food);
        }
        return retVal;
    }

}
