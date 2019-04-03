package com.zipcodewilmington.froilansfarm.factoryTest;

import com.zipcodewilmington.froilansfarm.factories.StorageFactory;
import com.zipcodewilmington.froilansfarm.storage.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StorageFactoryTest {

    @Test
    public void chickenCoopFactoryTest() {
        // Given
        Boolean correctInstance = false;

        // When
        ChickenCoops actual = StorageFactory.createSingleChickenCoop();

        // Then
        if (actual instanceof ChickenCoops) {
            correctInstance = true;
        }
        Assert.assertTrue(correctInstance);
    }


    @Test
    public void chickenCoopsFactoryTest() {
        // Given
        Integer expected = 3;
        ArrayList<ChickenCoops> actual;

        // When
        actual = StorageFactory.createMultiChickenCoops(3);
        Integer actualSize = actual.size();

        // Then
        Assert.assertEquals(expected, actualSize);
    }

    @Test
    public void cornSiloFactoryTest() {
        // Given
        Boolean correctInstance = false;

        // When
        CornSilo actual = StorageFactory.createSingleCornSilo();

        // Then
        if (actual instanceof CornSilo) {
            correctInstance = true;
        }
        Assert.assertTrue(correctInstance);
    }


    @Test
    public void cornSilosFactoryTest() {
        // Given
        Integer expected = 3;
        ArrayList<CornSilo> actual;

        // When
        actual = StorageFactory.createMultiCornSilos(3);
        Integer actualSize = actual.size();

        // Then
        Assert.assertEquals(expected, actualSize);
    }

    @Test
    public void cropRowFactoryTest() {
        // Given
        Boolean correctInstance = false;

        // When
        CropRows actual = StorageFactory.createSingleCropRow();
        // Then
        if (actual instanceof CropRows) {
            correctInstance = true;
        }
        Assert.assertTrue(correctInstance);
    }


    @Test
    public void cropRowsFactoryTest() {
        // Given
        Integer expected = 3;
        ArrayList<CropRows> actual;

        // When
        actual = StorageFactory.createMultiCropRows(3);
        Integer actualSize = actual.size();

        // Then
        Assert.assertEquals(expected, actualSize);
    }

    @Test
    public void pumpkinSiloFactoryTest() {
        // Given
        Boolean correctInstance = false;

        // When
        PumpkinSilo actual = StorageFactory.createSinglePumkinSilo();
        // Then
        if (actual instanceof PumpkinSilo) {
            correctInstance = true;
        }
        Assert.assertTrue(correctInstance);
    }


    @Test
    public void pumpkinSilosFactoryTest() {
        // Given
        Integer expected = 3;
        ArrayList<PumpkinSilo> actual;

        // When
        actual = StorageFactory.createMultiPumkinSilos(3);
        Integer actualSize = actual.size();

        // Then
        Assert.assertEquals(expected, actualSize);
    }

    @Test
    public void stableFactoryTest() {
        // Given
        Boolean correctInstance = false;

        // When
        Stables actual = StorageFactory.createSingleStables();
        // Then
        if (actual instanceof Stables) {
            correctInstance = true;
        }
        Assert.assertTrue(correctInstance);
    }


    @Test
    public void stablesFactoryTest() {
        // Given
        Integer expected = 3;
        ArrayList<Stables> actual;

        // When
        actual = StorageFactory.createMultiStables(3);
        Integer actualSize = actual.size();

        // Then
        Assert.assertEquals(expected, actualSize);
    }

    @Test
    public void tomatoSiloFactoryTest() {
        // Given
        Boolean correctInstance = false;

        // When
        TomatoSilo actual = StorageFactory.createSingleTomatoSilo();
        // Then
        if (actual instanceof TomatoSilo) {
            correctInstance = true;
        }
        Assert.assertTrue(correctInstance);
    }


    @Test
    public void tomatoSilosFactoryTest() {
        // Given
        Integer expected = 3;
        ArrayList<TomatoSilo> actual;

        // When
        actual = StorageFactory.createMultiTomatoSilos(3);
        Integer actualSize = actual.size();

        // Then
        Assert.assertEquals(expected, actualSize);
    }
}
