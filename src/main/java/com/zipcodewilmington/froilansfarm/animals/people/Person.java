package com.zipcodewilmington.froilansfarm.animals.people;

import com.zipcodewilmington.froilansfarm.animals.Animal;

import java.util.HashMap;

public class Person extends Animal {

    private String name;

    public String makeNoise() {
        return "Talking Loudly";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
