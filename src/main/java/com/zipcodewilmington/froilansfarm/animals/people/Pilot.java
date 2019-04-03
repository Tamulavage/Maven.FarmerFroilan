package com.zipcodewilmington.froilansfarm.animals.people;

import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Rideable;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Rider;

public class Pilot extends Person implements Rider {


    public void mount(Rideable ride) {
        ride.ride(this);
    }
}
