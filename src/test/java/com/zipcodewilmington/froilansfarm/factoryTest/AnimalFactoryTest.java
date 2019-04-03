package com.zipcodewilmington.froilansfarm.factoryTest;

import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Horse;
import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.animals.people.Pilot;
import com.zipcodewilmington.froilansfarm.factories.AnimalFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class AnimalFactoryTest {

    @Test
    public void horseFactoryTest() {
        // Given
        Boolean correctInstance = false;

        // When
        Horse actual = AnimalFactory.createHorse();

        // Then
        if (actual instanceof Horse) {
            correctInstance = true;
        }
        Assert.assertTrue(correctInstance);
    }


    @Test
    public void horsesFactoryTest() {
        // Given
        Integer expected = 3;
        ArrayList<Horse> actual;

        // When
        actual = AnimalFactory.createHorses(3);
        Integer actualSize = actual.size();

        // Then
        Assert.assertEquals(expected, actualSize);
    }

    @Test
    public void pilotFactoryTest() {
        // Given
        Boolean correctInstance = false;

        // When
        Pilot actual = AnimalFactory.createPilot();

        // Then
        if (actual instanceof Pilot) {
            correctInstance = true;
        }
        Assert.assertTrue(correctInstance);
    }


    @Test
    public void pilotsFactoryTest() {
        // Given
        Integer expected = 3;
        ArrayList<Pilot> actual;

        // When
        actual = AnimalFactory.createPilots(3);
        Integer actualSize = actual.size();

        // Then
        Assert.assertEquals(expected, actualSize);
    }

    @Test
    public void farmerFactoryTest() {
        // Given
        Boolean correctInstance = false;

        // When
        Farmer actual = AnimalFactory.createFarmer();

        // Then
        if (actual instanceof Farmer) {
            correctInstance = true;
        }
        Assert.assertTrue(correctInstance);
    }

    @Test
    public void farmersFactoryTest() {
        // Given
        Integer expected = 3;
        ArrayList<Farmer> actual;

        // When
        actual = AnimalFactory.createFarmers(3);
        Integer actualSize = actual.size();

        // Then
        Assert.assertEquals(expected, actualSize);
    }
}
