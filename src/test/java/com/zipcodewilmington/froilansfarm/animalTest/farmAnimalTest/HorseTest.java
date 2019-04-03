package com.zipcodewilmington.froilansfarm.animalTest.farmAnimalTest;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Horse;
import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Edible;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Rider;
import com.zipcodewilmington.froilansfarm.producers.produce.Corn;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class HorseTest {

    private Edible edible ;

    @Before
    public void prepEdibles(){
        edible = new Corn();
    }

    @Test
    public void testNullaryHorseConstructor(){
        // given
        Boolean expectedRiddenValue = false;

        // When
        Horse horse = new Horse();
        Boolean actualRiddenValue = horse.getHasBeenRiddenToday();

        // then
        Assert.assertEquals(expectedRiddenValue, actualRiddenValue);
    }

    @Test
    public void testGetSetRiddenToday(){
        // Given
        Boolean expected = true;
        Horse horse = new Horse();

        // When
        horse.setHasBeenRiddenToday(true);
        Boolean actual = horse.getHasBeenRiddenToday();

        // Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void testEatTwoFoodSameFood(){
        // Given
        Horse horse = new Horse();
        Integer expected = 2;

        // When
        horse.eat(edible);
        horse.eat(edible);
        HashMap<Edible, Integer> foodEaten = horse.getFood();
        Integer actual = foodEaten.get(edible);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMakeNoise(){
        // Given
        String expected = "Neigh!";
        Horse horse = new Horse();

        // When
        String actual = horse.makeNoise();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRide(){
        // Given
        Horse horse = new Horse();
        Boolean expected = true;
        Rider rider = new Farmer();

        // When
        horse.ride(rider);
        Boolean actual = horse.getHasBeenRiddenToday();

        //
        Assert.assertEquals(expected, actual);
    }

}
