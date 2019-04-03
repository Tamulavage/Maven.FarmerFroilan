package com.zipcodewilmington.froilansfarm.CropTests;

import com.zipcodewilmington.froilansfarm.producers.produce.Pumpkin;
import com.zipcodewilmington.froilansfarm.producers.produce.Tomato;
import com.zipcodewilmington.froilansfarm.storage.PumpkinSilo;
import com.zipcodewilmington.froilansfarm.storage.TomatoSilo;
import org.junit.Assert;
import org.junit.Test;

public class PumpkinSiloTests {
    @Test
    public void nullaryConstructorTest(){
        // given
        PumpkinSilo pumpkinSilo = new PumpkinSilo();
        Integer expected = 0;
        // when
        Integer actual = pumpkinSilo.getNumberOfPumpkins();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest(){
        // given
        PumpkinSilo pumpkinSilo = new PumpkinSilo(5);
        Integer expected = 5;
        // when
        Integer actual = pumpkinSilo.getNumberOfPumpkins();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfPumpkinsTest(){
        // given
        PumpkinSilo pumpkinSilo = new PumpkinSilo(4);
        Integer expected = 4;
        // when
        Integer actual = pumpkinSilo.getNumberOfPumpkins();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNumberOfPumpkinsTest(){
        // given
        PumpkinSilo pumpkinSilo = new PumpkinSilo(0);
        Integer expected = 3;
        // when
        pumpkinSilo.setNumberOfPumpkins(3);
        Integer actual = pumpkinSilo.getNumberOfPumpkins();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest(){
        // given
        PumpkinSilo pumpkinSilo = new PumpkinSilo(0);
        Pumpkin pumpkin = new Pumpkin();
        Integer expected = 1;
        // when
        pumpkinSilo.add(pumpkin);
        Integer actual = pumpkinSilo.getNumberOfPumpkins();
        // then
        Assert.assertEquals(expected, actual);
    }
}
