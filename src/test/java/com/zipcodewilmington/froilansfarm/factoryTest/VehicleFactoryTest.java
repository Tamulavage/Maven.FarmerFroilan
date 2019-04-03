package com.zipcodewilmington.froilansfarm.factoryTest;

import com.zipcodewilmington.froilansfarm.factories.VehicleFactory;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class VehicleFactoryTest {

    @Test
    public void cropDusterFactoryTest(){
        // Given
        Boolean correctInstance = false;

        // When
        CropDuster actual  = VehicleFactory.createSingleCropDuster();

        // Then
        if(actual instanceof CropDuster){
            correctInstance = true;
        }
        Assert.assertTrue(correctInstance);

    }

    @Test
    public void cropDusterFactoryMultiTest(){
        // Given
        Integer expected = 3;
        ArrayList<CropDuster> actual ;

        // When
        actual  = VehicleFactory.createMultiCropDuster(3);
        Integer actualSize = actual.size();

        // Then
        Assert.assertEquals(expected, actualSize);

    }

    @Test
    public void tractorFactoryTest(){
        // Given
        Boolean correctInstance = false;

        // When
        Tractor actual  = VehicleFactory.createSingleTractor();

        // Then
        if(actual instanceof Tractor){
            correctInstance = true;
        }
        Assert.assertTrue(correctInstance);
    }


    @Test
    public void tractorFactoryMultiTest(){
        // Given
        Integer expected = 3;
        ArrayList<Tractor> actual ;

        // When
        actual  = VehicleFactory.createMultiTractor(3);
        Integer actualSize = actual.size();

        // Then
        Assert.assertEquals(expected, actualSize);

    }

}
