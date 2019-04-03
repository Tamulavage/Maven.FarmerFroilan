package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.producers.produce.Corn;

public class CornSilo implements Storage<Corn> {
    public Integer numberOfCorn;

    public CornSilo(){
        this.numberOfCorn = 0;
    }

    public CornSilo(Integer numberOfCorn){
        this.numberOfCorn = numberOfCorn;
    }

    public Integer getNumberOfCorn(){
        return numberOfCorn;
    }

    public void setNumberOfCorn(Integer numberOfCorn){
        this.numberOfCorn = numberOfCorn;
    }

    public void add(Corn storageObject) {
        numberOfCorn = numberOfCorn + 1;
    }
}
