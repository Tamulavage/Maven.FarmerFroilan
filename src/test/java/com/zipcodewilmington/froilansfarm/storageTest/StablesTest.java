package com.zipcodewilmington.froilansfarm.storageTest;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Horse;
import com.zipcodewilmington.froilansfarm.storage.Stables;
import org.junit.Assert;
import org.junit.Test;

public class StablesTest {

    @Test
    public void testStablesAddHorse(){
        // Given
        Stables stables = new Stables();
        Integer expected = 1;

        // When
        stables.add(new Horse());
        Integer actual = stables.getCount();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testStablesRetrieveHorse(){
        // Given
        Stables stables = new Stables();
        Horse expected = new Horse();

        // When
        stables.add(expected);
        Integer newHorseAt = stables.getCount();
        Horse actual = stables.retrieve(newHorseAt-1);

        // Then
        Assert.assertEquals(expected, actual);

    }
}
