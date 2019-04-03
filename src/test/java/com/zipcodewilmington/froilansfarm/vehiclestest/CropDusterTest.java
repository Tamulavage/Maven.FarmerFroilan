package com.zipcodewilmington.froilansfarm.vehiclestest;

import com.zipcodewilmington.froilansfarm.producers.produce.Corn;
import com.zipcodewilmington.froilansfarm.producers.produce.Crop;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.CornStalk;
import com.zipcodewilmington.froilansfarm.storage.CropRows;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class CropDusterTest {

    @Test
    public void testMakeNoise(){
        // Given
        String expected = "Engine Roaring";
        CropDuster cropDuster = new CropDuster();

        // When
        String actual = cropDuster.makeNoise();

        // Then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testFertilizeRow(){
        // Given
        CropDuster cropDuster = new CropDuster();


        List<Crop> cropList = new ArrayList<Crop>();
        Crop cornStalk = new CornStalk();
        cropList.add(cornStalk);
        CropRows cropRows = new CropRows(cropList);


        // When
        cropDuster.fertilize(cropRows);
        List<Crop> cropListActual = cropRows.getCropList();
        Crop crop = cropListActual.get(0);
        Boolean actual = crop.getIsFertilized();

        // Then
        Assert.assertTrue(actual);

    }
}
