package com.zipcodewilmington.froilansfarm.animalTest.ChickenCoopsTest;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.factories.AnimalFactory;
import com.zipcodewilmington.froilansfarm.producers.produce.Egg;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoops;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ChickenCoopTest {
    List<Chicken> chickenList = AnimalFactory.createChickenList(5);
    Chicken newchicken = new Chicken();
    ChickenCoops chickenCoops = new ChickenCoops(chickenList);
    List<Egg> edibles;

    @Test
    public void getChickenListTest(){
        //Given
        chickenCoops.getChickenList();
        chickenCoops.setChickenList(chickenList);
        List<Chicken> list2 = AnimalFactory.createChickenList(8);
        Integer expected = 8;
        //When
        chickenCoops.setChickenList(list2);
        Integer actual = chickenCoops.getCount();

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void addTest(){
        //Given
        chickenCoops.add(newchicken);
        Integer expected = 6;

        //When
        Integer actual = chickenCoops.getCount();

        //Then
        Assert.assertEquals(expected,actual);



    }

    @Test
    public void removeTest(){
        //Given
        chickenCoops.add(newchicken);
        chickenCoops.add(newchicken);
        chickenCoops.add(newchicken);
        chickenCoops.remove(newchicken);
        Integer expected = 7;

        //When
        Integer actual = chickenCoops.getCount();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void clearTest(){
        //Given
        Integer expected = 0;

        //When
        chickenCoops.clear();
        Integer actual = chickenCoops.getCount();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void checkFertilizationTest(){
        //Given
        Boolean expected = true;

        //When
        Boolean actual = ChickenCoops.checkChickenFertilization(chickenList);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void collectEdibleEggsTest(){
        //Given
        Integer expected = 5;

        //When
        ChickenCoops.checkChickenFertilization(chickenList);
        edibles = ChickenCoops.collectEdibleEggs(chickenList);
        Integer actual = edibles.size();

        //Then
        Assert.assertEquals(expected,actual);

    }
}

