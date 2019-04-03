package com.zipcodewilmington.froilansfarm.CropTests;

import com.zipcodewilmington.froilansfarm.producers.produce.Egg;
import com.zipcodewilmington.froilansfarm.producers.produce.Tomato;
import com.zipcodewilmington.froilansfarm.storage.TomatoSilo;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TomatoSiloTests {
    @Test
    public void nullaryConstructorTest(){
        // given
        TomatoSilo tomatoSilo = new TomatoSilo();
        Integer expected = 0;
        // when
        Integer actual = tomatoSilo.getNumberOfTomatoes();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest(){
        // given
        TomatoSilo tomatoSilo = new TomatoSilo(5);
        Integer expected = 5;
        // when
        Integer actual = tomatoSilo.getNumberOfTomatoes();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfTomatoesTest(){
        // given
        TomatoSilo tomatoSilo = new TomatoSilo(4);
        Integer expected = 4;
        // when
        Integer actual = tomatoSilo.getNumberOfTomatoes();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNumberOfTomatoesTest(){
        // given
        TomatoSilo tomatoSilo = new TomatoSilo(0);
        Integer expected = 3;
        // when
        tomatoSilo.setNumberOfTomatoes(3);
        Integer actual = tomatoSilo.getNumberOfTomatoes();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest(){
        // given
        TomatoSilo tomatoSilo = new TomatoSilo(0);
        Tomato tomato = new Tomato();
        Integer expected = 1;
        // when
        tomatoSilo.add(tomato);
        Integer actual = tomatoSilo.getNumberOfTomatoes();
        // then
        Assert.assertEquals(expected, actual);
    }


}
