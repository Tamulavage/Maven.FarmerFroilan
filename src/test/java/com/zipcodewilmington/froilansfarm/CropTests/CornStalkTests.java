package com.zipcodewilmington.froilansfarm.CropTests;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Edible;
import com.zipcodewilmington.froilansfarm.producers.produce.Corn;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.CornStalk;
import com.zipcodewilmington.froilansfarm.storage.CornSilo;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTests {

    @Test
    public void nullaryConstructorTest(){
        // given
        CornStalk cornStalk = new CornStalk();
        Boolean expectedFertilized = false;
        // when
        Boolean actualFertilized = cornStalk.getIsFertilized();
        // then
        Assert.assertEquals(expectedFertilized, actualFertilized);
    }



    @Test
    public void getIsFertilizedTest(){
        // given
        CornStalk cornStalk = new CornStalk();
        Boolean expected = false;
        // when
        Boolean actual = cornStalk.getIsFertilized();
        // then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setIsFertilizedTest(){
        // given
        CornStalk cornStalk = new CornStalk();
        Boolean initial = cornStalk.getIsFertilized();
        // when
        cornStalk.setIsFertilized(true);
        Boolean newValue = cornStalk.getIsFertilized();
        // then
        Assert.assertNotEquals(initial, newValue);

    }

    @Test
    public void yieldTest1(){
        // given
     //   CornStalk cornStalk = new CornStalk(true);
        CornStalk cornStalk = new CornStalk();
        cornStalk.setIsFertilized(true);
        // when
        Corn product = cornStalk.yield();
        // then
        Assert.assertNotNull(product);
    }

    @Test
    public void yieldTest2(){
        // given
      //  CornStalk cornStalk = new CornStalk(false);
        CornStalk cornStalk = new CornStalk();
        // when
        Corn product = cornStalk.yield();
        // then
        Assert.assertNull(product);
    }
}
