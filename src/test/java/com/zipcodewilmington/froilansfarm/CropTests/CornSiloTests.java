package com.zipcodewilmington.froilansfarm.CropTests;

import com.zipcodewilmington.froilansfarm.producers.produce.Corn;
import com.zipcodewilmington.froilansfarm.storage.CornSilo;
import org.junit.Assert;
import org.junit.Test;

public class CornSiloTests {
    @Test
    public void nullaryConstructorTest(){
        // given
        CornSilo cornSilo = new CornSilo();
        Integer expected = 0;
        // when
        Integer actual = cornSilo.getNumberOfCorn();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest(){
        // given
        CornSilo cornSilo = new CornSilo(5);
        Integer expected = 5;
        // when
        Integer actual = cornSilo.getNumberOfCorn();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfCornTest(){
        // given
        CornSilo cornSilo = new CornSilo(4);
        Integer expected = 4;
        // when
        Integer actual = cornSilo.getNumberOfCorn();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNumberOfCornTest(){
        // given
        CornSilo cornSilo = new CornSilo(0);
        Integer expected = 3;
        // when
        cornSilo.setNumberOfCorn(3);
        Integer actual = cornSilo.getNumberOfCorn();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest(){
        // given
        CornSilo cornSilo = new CornSilo(0);
        Corn corn = new Corn();
        Integer expected = 1;
        // when
        cornSilo.add(corn);
        Integer actual = cornSilo.getNumberOfCorn();
        // then
        Assert.assertEquals(expected, actual);
    }
}
