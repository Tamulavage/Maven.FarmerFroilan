package com.zipcodewilmington.froilansfarm.producers.produce;

import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Edible;

public abstract class  Crop implements ProduceInterface {


    private Boolean isFertilized;

    public Edible yield() {
        return null;
    }


    public Boolean getIsFertilized(){
        return this.isFertilized;
    }

    public void setIsFertilized(Boolean isFertilized){
        this.isFertilized = isFertilized;
    }
}
