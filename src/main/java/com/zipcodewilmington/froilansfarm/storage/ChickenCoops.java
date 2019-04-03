package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.producers.produce.Egg;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoops implements  Storage<Chicken> {
    List<Chicken> chickenList = new ArrayList<Chicken>();
    private Egg egg;

    public ChickenCoops(List<Chicken> chickenCoop){
        this.chickenList = chickenCoop;

    }
    public ChickenCoops(){

    }
    public List<Chicken> getChickenList(){ return chickenList; }

    public void setChickenList(List<Chicken> chickenList){ this.chickenList = chickenList;}

    public void add(Chicken chicken) { this.chickenList.add(chicken); }

    public void remove(Chicken chicken){ chickenList.remove(chicken); }

    public Integer getCount() { return chickenList.size(); }

    public void clear() { chickenList.clear(); }

    public static Boolean checkChickenFertilization(List<Chicken> chickenCoop){
        for (Chicken c: chickenCoop ) {
            c.hasBeenFertilized();
        }
        return true;
    }

    public static List<Egg> collectEdibleEggs(List<Chicken> chickenCoop) {
        List<Egg> edibleEggs = new ArrayList<>();
        if (checkChickenFertilization(chickenCoop) == true) {
            for (Chicken c : chickenCoop) {
                edibleEggs.add(c.yield());
            }
        }
        return edibleEggs;
    }

}




