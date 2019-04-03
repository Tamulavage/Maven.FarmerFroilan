package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.animals.people.Person;
import com.zipcodewilmington.froilansfarm.animals.people.Pilot;

import java.util.ArrayList;

public class Farmhouse implements Storage<Person>{

    private ArrayList<Person> people;

    public Farmhouse(){
        people = new ArrayList<Person>();
    }


    public void add(Person person) {
        people.add(person);
    }

    public Person retrieveAtIndex(Integer index) {
        return this.people.get(index);
    }

    public Integer getCount() {
        return people.size();
    }

    public Pilot getPilotFromFarm() {
        Pilot retVal = null;
        Integer countOfPeopleInHouse = this.getCount();
        for (int i = 0; i < countOfPeopleInHouse; i++) {
            Person person = this.retrieveAtIndex(i);
            if (person instanceof Pilot) {
                retVal = (Pilot) person;
            }
        }
        return retVal;
    }

    public Farmer getFarmerFromFarm() {
        Farmer retVal = null;
        Integer countOfPeopleInHouse = this.getCount();
        for (int i = 0; i < countOfPeopleInHouse; i++) {
            Person person = this.retrieveAtIndex(i);
            if (person instanceof Farmer) {
                retVal = (Farmer) person;
            }
        }

        return retVal;
    }
}
