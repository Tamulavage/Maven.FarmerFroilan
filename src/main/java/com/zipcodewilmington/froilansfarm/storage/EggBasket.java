package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.factories.AnimalFactory;
import com.zipcodewilmington.froilansfarm.producers.produce.Egg;

import java.util.ArrayList;
import java.util.List;

public class EggBasket implements Storage<Egg> {
    List<Egg> eggBasket = new ArrayList<>();
    Integer numberOfEggs;

    public EggBasket(){ this.numberOfEggs = 0; }

    public EggBasket(Integer numberOfEggs){ this.numberOfEggs = numberOfEggs; }

    public Boolean isEmpty(EggBasket eggBasket) { return this.eggBasket.isEmpty(); }

    public void add(Egg edibleEgg) {this.eggBasket.add(edibleEgg); }

    public void removeEgg(Egg edibleEgg){this.eggBasket.remove(edibleEgg);}

    public Integer getNumberOfEggs(){return eggBasket.size();}

    public void addEdibleEggsFromCoop(List<Egg> edibleEggs){ eggBasket.addAll(edibleEggs); }

    public void removeAllEggs(){ this.eggBasket.clear();}
}
