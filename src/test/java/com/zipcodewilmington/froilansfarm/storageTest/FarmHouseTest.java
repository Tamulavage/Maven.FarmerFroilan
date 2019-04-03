package com.zipcodewilmington.froilansfarm.storageTest;

import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.animals.people.Person;
import com.zipcodewilmington.froilansfarm.animals.people.Pilot;
import com.zipcodewilmington.froilansfarm.storage.Farmhouse;
import org.junit.Assert;
import org.junit.Test;

public class FarmHouseTest {

    @Test
    public void testAddPersonToFarmHouse(){
        // Given
        Farmhouse house = new Farmhouse();
        Person expected = new Person();

        // When
        house.add(expected);
        Person actual = house.retrieveAtIndex(0);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountPeopleInFarmHouse(){
        // Given
        Farmhouse house = new Farmhouse();
        Person Person1 = new Person();
        Person Person2 = new Person();
        Integer expected = 2;

        // When
        house.add(Person1);
        house.add(Person2);
        Integer actual = house.getCount();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetPilot(){
        // Given
        Farmhouse house = new Farmhouse();
        Person expected = new Pilot();
        house.add(expected);

        // When
        Person actual = house.getPilotFromFarm();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFarmer(){
        // Given
        Farmhouse house = new Farmhouse();
        Person expected = new Farmer();
        house.add(expected);

        // When
        Person actual = house.getFarmerFromFarm();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
