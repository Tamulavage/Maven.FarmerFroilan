package com.zipcodewilmington.froilansfarm.weekdayTest;

import com.zipcodewilmington.froilansfarm.dailyactivitesexecution.*;
import com.zipcodewilmington.froilansfarm.dailyactivitesexecution.daysofweek.*;
import org.junit.Assert;
import org.junit.Test;

public class EnumTest {
    @Test
    public void enumTestMondayLaunch(){
        // Given
        Boolean isCorrectInstance =  false;

        // When
        DayInterface day = Weekdays.MONDAY.newDay();

        // Then
        if(day instanceof Monday){
            isCorrectInstance = true;
        }
        Assert.assertTrue(isCorrectInstance);
    }
    @Test
    public void enumTestTuessdayLaunch(){
        // Given
        Boolean isCorrectInstance =  false;

        // When
        DayInterface day = Weekdays.TUESDAY.newDay();

        // Then
        if(day instanceof Tuesday){
            isCorrectInstance = true;
        }
        Assert.assertTrue(isCorrectInstance);
    }
    @Test
    public void enumTestWednesdayLaunch(){
        // Given
        Boolean isCorrectInstance =  false;

        // When
        DayInterface day = Weekdays.WEDNESDAY.newDay();

        // Then
        if(day instanceof Wednesday){
            isCorrectInstance = true;
        }
        Assert.assertTrue(isCorrectInstance);
    }
    @Test
    public void enumTestThursdayLaunch(){
        // Given
        Boolean isCorrectInstance =  false;

        // When
        DayInterface day = Weekdays.THURSDAY.newDay();

        // Then
        if(day instanceof Thursday){
            isCorrectInstance = true;
        }
        Assert.assertTrue(isCorrectInstance);
    }
    @Test
    public void enumTestFridayLaunch(){
        // Given
        Boolean isCorrectInstance =  false;

        // When
        DayInterface day = Weekdays.FRIDAY.newDay();

        // Then
        if(day instanceof Friday){
            isCorrectInstance = true;
        }
        Assert.assertTrue(isCorrectInstance);
    }
    @Test
    public void enumTestSaturdayLaunch(){
        // Given
        Boolean isCorrectInstance =  false;

        // When
        DayInterface day = Weekdays.SATURDAY.newDay();

        // Then
        if(day instanceof Saturday){
            isCorrectInstance = true;
        }
        Assert.assertTrue(isCorrectInstance);
    }
    @Test
    public void enumTestSundayLaunch(){
        // Given
        Boolean isCorrectInstance =  false;

        // When
        DayInterface day = Weekdays.SUNDAY.newDay();

        // Then
        if(day instanceof Sunday){
            isCorrectInstance = true;
        }
        Assert.assertTrue(isCorrectInstance);
    }
}
