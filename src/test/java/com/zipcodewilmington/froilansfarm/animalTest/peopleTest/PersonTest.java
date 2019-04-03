package com.zipcodewilmington.froilansfarm.animalTest.peopleTest;

import com.zipcodewilmington.froilansfarm.animals.people.Person;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Edible;
import com.zipcodewilmington.froilansfarm.producers.produce.Corn;
import com.zipcodewilmington.froilansfarm.producers.produce.Egg;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class PersonTest {
    private Edible edible ;

    @Before
    public void prepEdibles(){
        edible = new Egg();
    }

    @Test
    public void testGetSetName(){
        // Given
        Person person = new Person();
        String expected = "Froilan";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testEatNewFood(){
        // Given
        Person person = new Person();
        Edible expected = new Corn();

        // When
        person.eat(expected);
        HashMap foodEaten  = person.getFood();

        // Then
        Assert.assertTrue(foodEaten.containsKey(expected));
    }

    @Test
    public void testNotEatenFood(){
        // Given
        Person person = new Person();
        Integer expected = null;

        // When
        HashMap<Edible, Integer> foodEaten = person.getFood();
        Integer actual = foodEaten.get(edible);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEatTwoFoodSameFood(){
        // Given
        Person person = new Person();
        Integer expected = 2;

        // When
        person.eat(edible);
        person.eat(edible);
        HashMap<Edible, Integer> foodEaten = person.getFood();
        Integer actual = foodEaten.get(edible);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEatTwoFoodDifferentFood(){
        // Given
        Person person = new Person();
        Edible edible2 = new Corn();

        // When
        person.eat(edible);
        person.eat(edible2);
        HashMap<Edible, Integer> foodEaten = person.getFood();

        // Then
        Assert.assertTrue(foodEaten.containsKey(edible));
        Assert.assertTrue(foodEaten.containsKey(edible2));
    }

    @Test
    public void testMakeNoise(){
        // Given
        Person person = new Person();
        String expected = "Talking Loudly";

        // When
        String actual = person.makeNoise();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
