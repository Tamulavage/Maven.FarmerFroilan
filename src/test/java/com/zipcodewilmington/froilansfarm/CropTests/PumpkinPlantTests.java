package com.zipcodewilmington.froilansfarm.CropTests;

import com.zipcodewilmington.froilansfarm.producers.produce.Pumpkin;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.PumpkinPlant;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class PumpkinPlantTests {
    @Test
    public void nullaryConstructorTest(){
        // given
        PumpkinPlant pumpkinPlant = new PumpkinPlant();
        Boolean expectedFertilized = false;
        Integer expectedNumberOfPumpkins = 0;
        // when
        Boolean actualFertilized = pumpkinPlant.getIsFertilized();
        Integer actualNumberOfPumpkins = pumpkinPlant.getNumberOfPumpkins();
        // then
        Assert.assertEquals(expectedFertilized, actualFertilized);
        Assert.assertEquals(expectedNumberOfPumpkins, actualNumberOfPumpkins);
    }

    @Test
    public void constructorTest(){
        // given
        PumpkinPlant pumpkinPlant = new PumpkinPlant(true, 4);
        Boolean expectedFertilized = true;
        Integer expectedNumberOfPumpkins = 4;
        // when
        Boolean actualFertilized = pumpkinPlant.getIsFertilized();
        Integer actualNumberOfPumpkins = pumpkinPlant.getNumberOfPumpkins();
        // then
        Assert.assertEquals(expectedFertilized, actualFertilized);
        Assert.assertEquals(expectedNumberOfPumpkins, actualNumberOfPumpkins);
    }

    @Test
    public void getIsFertilizedTest(){
        // given
        PumpkinPlant pumpkinPlant = new PumpkinPlant(false, 6);
        Boolean expected = false;
        // when
        Boolean actual = pumpkinPlant.getIsFertilized();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfPumpkinsTest(){
        // given
        PumpkinPlant pumpkinPlant = new PumpkinPlant(true, 3);
        Integer expected = 3;
        // when
        Integer actual = pumpkinPlant.getNumberOfPumpkins();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIsFertilizedTest(){
        // given
        PumpkinPlant pumpkinPlant = new PumpkinPlant(false, 3);
        Boolean initial = pumpkinPlant.getIsFertilized();
        // when
        pumpkinPlant.setIsFertilized(true);
        Boolean newValue = pumpkinPlant.getIsFertilized();
        // then
        Assert.assertNotEquals(initial, newValue);
    }

    @Test
    public void setNumberOfPumpkinsTest(){
        // given
        PumpkinPlant pumpkinPlant = new PumpkinPlant(true, 2);
        Integer initial = pumpkinPlant.getNumberOfPumpkins();
        // when
        pumpkinPlant.setNumberOfPumpkins(5);
        Integer newValue = pumpkinPlant.getNumberOfPumpkins();
        // then
        Assert.assertNotEquals(initial, newValue);
    }

    @Test
    public void yieldTest1(){
        // given
        PumpkinPlant pumpkinPlant = new PumpkinPlant(true, 4);
        // when
        Pumpkin product = pumpkinPlant.yield();
        // then
        Assert.assertNotNull(product);
    }

    @Test
    public void yieldTest2(){
        // given
        PumpkinPlant pumpkinPlant = new PumpkinPlant(false, 0);
        // when
        Pumpkin product = pumpkinPlant.yield();
        // then
        Assert.assertNull(product);
    }
}
