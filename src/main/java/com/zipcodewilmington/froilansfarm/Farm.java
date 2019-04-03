package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Chicken;

import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.animals.people.Person;
import com.zipcodewilmington.froilansfarm.animals.people.Pilot;
import com.zipcodewilmington.froilansfarm.dailyactivitesexecution.DayInterface;
import com.zipcodewilmington.froilansfarm.dailyactivitesexecution.Weekdays;
import com.zipcodewilmington.froilansfarm.factories.AnimalFactory;
import com.zipcodewilmington.froilansfarm.factories.StorageFactory;
import com.zipcodewilmington.froilansfarm.factories.VehicleFactory;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoops;
import com.zipcodewilmington.froilansfarm.storage.Farmhouse;
import com.zipcodewilmington.froilansfarm.storage.Field;
import com.zipcodewilmington.froilansfarm.storage.Stables;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;

import java.util.ArrayList;
import java.util.List;

public final class Farm {
    private ArrayList<Stables> stablesBuildings;
    private ArrayList<ChickenCoops> chickenCoopsBuildings;
    private ArrayList<Tractor> tractors;
    private List<Chicken> chickenList;
    private Farmhouse farmhouse;
    private Field field;
    private CropDuster cropDuster;

    private static final Farm instance = new Farm();

    public static Farm getInstance() {return instance;};



    private Farm() {
        farmhouse = new Farmhouse();
        field = new Field();
        cropDuster = VehicleFactory.createSingleCropDuster();
        chickenList = AnimalFactory.createChickenList(2);
        tractors = VehicleFactory.createMultiTractor(2);
        stablesBuildings = StorageFactory.createMultiStables(3);
        chickenCoopsBuildings = StorageFactory.createMultiChickenCoops(3);

        generatePilot();
        generateFarmer();
    }



    public void executeRoutine(Weekdays weekday) {

    }

    private void generatePilot(){
        Pilot pilot = AnimalFactory.createPilot();
        pilot.setName("Froilanda");
        addPeopleToFarmHouse(pilot);
    }

    private void generateFarmer(){
        Farmer farmer = AnimalFactory.createFarmer();
        farmer.setName("Froilan");
        addPeopleToFarmHouse(farmer);
    }

    private void addPeopleToFarmHouse(Person person){
            farmhouse.add(person);
    }

    public ArrayList<Stables> getStablesBuildings()
    {
        return  this.stablesBuildings;
    }

    public ArrayList<ChickenCoops> getChickenCoops()
    {
        return  this.chickenCoopsBuildings;
    }

    public ArrayList<Tractor> getTractors()
    {
        return this.tractors;
    }

    public Tractor getTractor(Integer index)
    {
        return this.tractors.get(index);
    }

    public Farmhouse getFarmhouse(){
        return this.farmhouse;
    }

    public Field getField(){
        return this.field;
    }

    public CropDuster getCropDuster(){
        return this.cropDuster;
    }


}
