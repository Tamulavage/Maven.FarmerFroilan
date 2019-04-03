package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.dailyactivitesexecution.Weekdays;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {


    public static void main(String[] args) {
        Farm farm= Farm.getInstance();
        farm.executeRoutine(Weekdays.MONDAY);
        farm.executeRoutine(Weekdays.TUESDAY);
        farm.executeRoutine(Weekdays.WEDNESDAY);
        farm.executeRoutine(Weekdays.THURSDAY);
        farm.executeRoutine(Weekdays.FRIDAY);
        farm.executeRoutine(Weekdays.SATURDAY);
        farm.executeRoutine(Weekdays.SUNDAY);
    }

}
