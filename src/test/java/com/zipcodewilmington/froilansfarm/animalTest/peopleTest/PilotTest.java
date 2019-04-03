package com.zipcodewilmington.froilansfarm.animalTest.peopleTest;

import com.zipcodewilmington.froilansfarm.animals.people.Pilot;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Rider;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class PilotTest {

    @Test
    public void testPilotRide(){
        // Given
        Pilot expected = new Pilot();
        CropDuster cropDuster = new CropDuster();

        // When
        expected.mount(cropDuster);
        Rider actual = cropDuster.getOperator();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPilotExitVehicle(){
        // Given
        Pilot expected = new Pilot();
        CropDuster cropDuster = new CropDuster();

        // When
        expected.mount(cropDuster);
        cropDuster.exitVehicle();
        Rider actual = cropDuster.getOperator();

        // Then
        Assert.assertNull(actual);
    }
}
