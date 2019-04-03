package com.zipcodewilmington.froilansfarm.factories;

import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import com.zipcodewilmington.froilansfarm.vehicles.Vehicle;

import java.util.ArrayList;

public class VehicleFactory{

    public static ArrayList<CropDuster> createMultiCropDuster(Integer amount) {
        ArrayList<CropDuster> cropDusters = new ArrayList<CropDuster>();

        for(int i = 0; i<amount; i++){
            cropDusters.add(new CropDuster());
        }

        return cropDusters;
    }

    public static CropDuster createSingleCropDuster() {
        CropDuster cropDuster = createMultiCropDuster(1).get(0);

        return cropDuster;
    }

    public static ArrayList<Tractor> createMultiTractor(Integer amount) {
        ArrayList<Tractor> tractors = new ArrayList<Tractor>();

        for(int i = 0; i<amount; i++){
            tractors.add(new Tractor());
        }

        return tractors;
    }

    public static Tractor createSingleTractor() {
        Tractor tractor = createMultiTractor(1).get(0);

        return tractor;
    }


}
