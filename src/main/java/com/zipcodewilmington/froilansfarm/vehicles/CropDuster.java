package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.producers.produce.Crop;
import com.zipcodewilmington.froilansfarm.storage.CropRows;

import java.util.List;

public class CropDuster extends FarmVehicle implements Aircraft{
    public String makeNoise() {
        return "Engine Roaring";
    }

    public void fertilize(CropRows cropRow) {
        List<Crop> cropToFertilize =   cropRow.getCropList();
        for(Crop c: cropToFertilize){
            c.setIsFertilized(true);
        }
    }

}
