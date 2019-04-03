package com.zipcodewilmington.froilansfarm.factories;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoops;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ChickenFactoryTest {
    Chicken chicken = new Chicken();
    Chicken[]chickens = {chicken, chicken, chicken};
    List<Chicken> coop = new ArrayList<Chicken>(Arrays.asList(chickens));

    @Test
    public void createChicken() {
        //Given
        Chicken newchicken = new Chicken();
        Integer expected = 4;

        //When
        coop.add(newchicken);
        Integer actual = coop.size();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void createChickenList(){
        //Given
        List<Chicken> chickList = AnimalFactory.createChickenList(15);

        //When
        Boolean actual = chickList.isEmpty();

        //Then
        Assert.assertEquals(false,actual);
    }

    @Test
    public void createChickenList2(){
        //Given
        List<Chicken> chickList = AnimalFactory.createChickenList(15);

        //When
        chickList.clear();
        Boolean actual = chickList.isEmpty();

        //Then
        Assert.assertEquals(true,actual);
    }

    @Test
    public void createChickenList3(){
        //Given
        List<Chicken> chickList = AnimalFactory.createChickenList(15);
        Integer expected = 17;

        //When
        chickList.add(chicken);
        chickList.add(chicken);
        chickList.add(chicken);
        chickList.remove(chicken);
        Integer actual = chickList.size();

        //Then
        Assert.assertEquals(expected,actual);
    }

}