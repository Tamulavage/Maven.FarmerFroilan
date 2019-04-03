package com.zipcodewilmington.froilansfarm.dailyactivitesexecution;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.animals.people.Pilot;
import com.zipcodewilmington.froilansfarm.factories.AnimalFactory;
import com.zipcodewilmington.froilansfarm.factories.StorageFactory;
import com.zipcodewilmington.froilansfarm.storage.CornSilo;
import com.zipcodewilmington.froilansfarm.storage.PumpkinSilo;
import com.zipcodewilmington.froilansfarm.storage.Stables;
import com.zipcodewilmington.froilansfarm.storage.TomatoSilo;

public class MorningRoutine {
    Farm farm = Farm.getInstance();
    Farmer froilan = AnimalFactory.createFarmer();
    Pilot froilanda = AnimalFactory.createPilot();
    CornSilo cornSilo = StorageFactory.createSingleCornSilo();
    TomatoSilo tomatoSilo = StorageFactory.createSingleTomatoSilo();
    PumpkinSilo pumpkinSilo = StorageFactory.createSinglePumkinSilo();
    Stables stables = StorageFactory.createSingleStables();
   // Stables stablesmulti = StorageFactory.createMultiStables(3);





    public void MorningPreparation(){

    }

    private void goForARide() {

    }

    private void feedTheHorses() {

    }

    private void breakfastTime() {

    }











}
