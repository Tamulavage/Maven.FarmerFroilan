package com.zipcodewilmington.froilansfarm.CropTests.produceTest;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.factories.AnimalFactory;
import com.zipcodewilmington.froilansfarm.producers.produce.Egg;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoops;
import com.zipcodewilmington.froilansfarm.storage.EggBasket;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EggBasketTest {
    EggBasket eggBasket = new EggBasket();
    Egg edibleEgg = new Egg();
    Egg[] eggs = {edibleEgg,edibleEgg,edibleEgg,edibleEgg,edibleEgg};
    List<Egg> eggsList = Arrays.asList(eggs);

        @Test
        public void addTest() {
            //Given
            eggBasket.add(edibleEgg);
            Boolean expected = false;
            //When
            Boolean actual = eggBasket.isEmpty(eggBasket);
            //Then
            Assert.assertEquals(expected,actual);

        }

        @Test
        public void removeTest(){
            //Given
            eggBasket.add(edibleEgg);
            eggBasket.add(edibleEgg);
            Integer expected = 1;

            //When
            eggBasket.removeEgg(edibleEgg);
            Integer actual = eggBasket.getNumberOfEggs();

            //Then
            Assert.assertEquals(expected,actual);
        }

        @Test
        public void getNumberOfEggsTest(){
            //Given
            eggBasket.add(edibleEgg);
            eggBasket.add(edibleEgg);
            eggBasket.add(edibleEgg);
            Integer expected = 3;

            //When
            Integer actual = eggBasket.getNumberOfEggs();

            //Then
            Assert.assertEquals(expected,actual);
        }

        @Test
        public void addEdibleEggsFromCoopTest(){
            //Given
            eggBasket.addEdibleEggsFromCoop(eggsList);
            Integer expected = 5;

            //When
            Integer actual = eggBasket.getNumberOfEggs();

            //Then
            Assert.assertEquals(expected,actual);
        }



    @Test
    public void removeAllEggs() {
            //Given
        eggBasket.addEdibleEggsFromCoop(eggsList);
        Boolean expected = true;

        //When
        eggBasket.removeAllEggs();
        Boolean actual = eggBasket.isEmpty(eggBasket);

        //Then
        Assert.assertEquals(expected,actual);
    }
}
