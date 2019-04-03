package com.zipcodewilmington.froilansfarm.animalTest.peopleTest;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Horse;
import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.producers.produce.Crop;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.TomatoPlant;
import com.zipcodewilmington.froilansfarm.storage.CropRows;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FarmerTest {
    @Test
    public void constructorTest(){
        // given
        Farmer farmer = new Farmer("Froilanda");
        String expected = "Froilanda";
        // when
        String actual = farmer.getName();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nullaryConstructorTest(){
        // given
        Farmer farmer = new Farmer();
        String expected = "Froilan";
        // when
        String actual = farmer.getName();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest(){
        // given
        Farmer farmer = new Farmer();
        String expected = "Froilan";
        // when
        String actual = farmer.getName();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void plantTest(){
        // given
        Farmer farmer = new Farmer();
        CropRows cropRows = new CropRows();
        List<Crop> cropList = cropRows.getCropList();
        Crop tomatoPlant = new TomatoPlant();
        // when
        farmer.plant(tomatoPlant, cropRows);
        // then
        Assert.assertEquals(1, cropList.size());
    }

    @Test
    public void testRide() {
        // Given
        Farmer farmer = new Farmer();
        Horse horse = new Horse();

        // When
        farmer.mount(horse);
        Boolean actual = horse.getHasBeenRiddenToday();

        // Then
        Assert.assertTrue(actual);
    }
}
