package com.zipcodewilmington.froilansfarm.dailyactivitesexecution;


import com.zipcodewilmington.froilansfarm.dailyactivitesexecution.daysofweek.*;

import java.util.function.Supplier;

public enum Weekdays {
    MONDAY(Monday:: new),
    TUESDAY(Tuesday:: new),
    WEDNESDAY(Wednesday::new),
    THURSDAY(Thursday:: new),
    FRIDAY(Friday:: new),
    SATURDAY(Saturday:: new),
    SUNDAY(Sunday:: new);

    private final Supplier<DayInterface> supplier;

    Weekdays(Supplier<DayInterface> supplier ) {this.supplier = supplier;}

    public DayInterface newDay() { return supplier.get();}

    public static Weekdays chooseWeekday(String string){
        return valueOf(string);
    }
}
