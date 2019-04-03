package com.zipcodewilmington.froilansfarm.CropTests;

import com.zipcodewilmington.froilansfarm.producers.produce.Tomato;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTests {
    @Test
    public void nullaryConstructorTest(){
        // given
        TomatoPlant tomatoPlant = new TomatoPlant();
        Boolean expectedFertilized = false;
        Integer expectedNumberOfTomatoes = 0;
        // when
        Boolean actualFertilized = tomatoPlant.getIsFertilized();
        Integer actualNumberOfTomatoes = tomatoPlant.getNumberOfTomatoes();
        // then
        Assert.assertEquals(expectedFertilized, actualFertilized);
        Assert.assertEquals(expectedNumberOfTomatoes, actualNumberOfTomatoes);
    }

    @Test
    public void constructorTest(){
        // given
        TomatoPlant tomatoPlant = new TomatoPlant(true, 4);
        Boolean expectedFertilized = true;
        Integer expectedNumberOfTomatoes = 4;
        // when
        Boolean actualFertilized = tomatoPlant.getIsFertilized();
        Integer actualNumberOfTomatoes = tomatoPlant.getNumberOfTomatoes();
        // then
        Assert.assertEquals(expectedFertilized, actualFertilized);
        Assert.assertEquals(expectedNumberOfTomatoes, actualNumberOfTomatoes);
    }

    @Test
    public void getIsFertilizedTest(){
        // given
        TomatoPlant tomatoPlant = new TomatoPlant(false, 6);
        Boolean expected = false;
        // when
        Boolean actual = tomatoPlant.getIsFertilized();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfCornTest(){
        // given
        TomatoPlant tomatoPlant = new TomatoPlant(true, 3);
        Integer expected = 3;
        // when
        Integer actual = tomatoPlant.getNumberOfTomatoes();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIsFertilizedTest(){
        // given
        TomatoPlant tomatoPlant = new TomatoPlant(false, 3);
        Boolean initial = tomatoPlant.getIsFertilized();
        // when
        tomatoPlant.setIsFertilized(true);
        Boolean newValue = tomatoPlant.getIsFertilized();
        // then
        Assert.assertNotEquals(initial, newValue);
    }

    @Test
    public void setNumberOfCornTest(){
        // given
        TomatoPlant tomatoPlant = new TomatoPlant(true, 2);
        Integer initial = tomatoPlant.getNumberOfTomatoes();
        // when
        tomatoPlant.setNumberOfTomatoes(5);
        Integer newValue = tomatoPlant.getNumberOfTomatoes();
        // then
        Assert.assertNotEquals(initial, newValue);
    }

    @Test
    public void yieldTest1(){
        // given
        TomatoPlant tomatoPlant = new TomatoPlant(true, 4);
        // when
        Tomato product = tomatoPlant.yield();
        // then
        Assert.assertNotNull(product);
    }

    @Test
    public void yieldTest2(){
        // given
        TomatoPlant tomatoPlant = new TomatoPlant(false, 0);
        // when
        Tomato product = tomatoPlant.yield();
        // then
        Assert.assertNull(product);
    }
}
