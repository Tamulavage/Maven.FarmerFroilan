package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.interfaceBehaviors.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Rideable;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Rider;

public abstract  class Vehicle implements Rideable, NoiseMaker {
    private Rider operator ;



    public void ride(Rider rider) {
        this.operator =  rider;
    }

    public void exitVehicle() {
        this.operator =  null;
    }

    public Rider getOperator()
    {
        return this.operator;
    }
}
