package com.zipcodewilmington.froilansfarm.CropTests;

import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Edible;
import com.zipcodewilmington.froilansfarm.producers.produce.Corn;
import com.zipcodewilmington.froilansfarm.producers.produce.Crop;
import com.zipcodewilmington.froilansfarm.producers.produce.Tomato;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.CornStalk;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.PumpkinPlant;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.TomatoPlant;
import com.zipcodewilmington.froilansfarm.storage.CropRows;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CropRowsTest {
    @Test
    public void constructorTest(){
        // given
        TomatoPlant tomatoPlant = new TomatoPlant();
        List<Crop> cropList = new ArrayList<Crop>();
        cropList.add(tomatoPlant);
        CropRows cropRows = new CropRows(cropList);
        Integer expected = 1;
        // when
        Integer actual = cropRows.getNumberOfCrops();
        // then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getCropListTest(){
        // given
        List<Crop> cropList = new ArrayList<Crop>();
        CropRows cropRows = new CropRows(cropList);
        // when
        List<Crop> receivedCropList = cropRows.getCropList();
        // then
        Assert.assertNotNull(receivedCropList);
    }

    @Test
    public void getNumberOfCropsTest(){
        // given
        List<Crop> cropList = new ArrayList<Crop>();
        Crop cornStalk = new CornStalk();
        Crop tomatoPlant = new TomatoPlant();
        cropList.add(cornStalk);
        cropList.add(tomatoPlant);
        CropRows cropRows = new CropRows(cropList);
        Integer expected = 2;
        // when
        Integer actual = cropRows.getNumberOfCrops();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest(){
        // given
        List<Crop> cropList = new ArrayList<Crop>();
        Crop pumpkinPlant = new PumpkinPlant();
        cropList.add(pumpkinPlant);
        CropRows cropRows = new CropRows(cropList);
        Integer expected = 1;
        // when
        Integer actual = cropRows.getNumberOfCrops();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAllTest(){
        // given
        List<Crop> cropList = new ArrayList<Crop>();
        Crop cornStalk = new CornStalk();
        cropList.add(cornStalk);
        CropRows cropRows = new CropRows(cropList);
        // when
        cropRows.removeAll();
        // then
        Assert.assertTrue(cropList.isEmpty());
    }
}
