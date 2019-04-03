package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Horse;

import java.util.ArrayList;

public class Stables implements  Storage<Horse> {
    private ArrayList<Horse> horses;

    public Stables(){
        horses = new ArrayList<Horse>();
    }

    public void add(Horse horse) {
        horses.add(horse);
    }

    public Horse retrieve(Integer horseID){
        return this.horses.get(horseID);
    }

    public Integer getCount(){
        return this.horses.size();
    }


}
