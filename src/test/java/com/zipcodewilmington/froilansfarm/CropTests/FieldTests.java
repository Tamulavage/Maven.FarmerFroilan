package com.zipcodewilmington.froilansfarm.CropTests;

import com.zipcodewilmington.froilansfarm.factories.StorageFactory;
import com.zipcodewilmington.froilansfarm.storage.CropRows;
import com.zipcodewilmington.froilansfarm.storage.Field;
import org.junit.Assert;
import org.junit.Test;

public class FieldTests {

    @Test
    public void getNumberOfCropRowsTest(){
        // given
        Field field = new Field();
        CropRows cropRows1 = StorageFactory.createSingleCropRow();
        CropRows cropRows2 = StorageFactory.createSingleCropRow();
        field.add(cropRows1);
        field.add(cropRows2);
        Integer expected = 2;
        // when
        Integer actual = field.getNumberOfCropRows();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest(){
        // given
        Field field = new Field();
        CropRows cropRows = StorageFactory.createSingleCropRow();
        Integer expected = 1;
        // when
        field.add(cropRows);
        Integer actual = field.getNumberOfCropRows();
        // then
        Assert.assertEquals(expected, actual);
    }
}
