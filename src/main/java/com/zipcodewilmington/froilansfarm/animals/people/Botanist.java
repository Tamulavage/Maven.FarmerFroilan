package com.zipcodewilmington.froilansfarm.animals.people;

import com.zipcodewilmington.froilansfarm.producers.produce.Crop;
import com.zipcodewilmington.froilansfarm.storage.CropRows;

public interface Botanist {
    void plant(Crop crop, CropRows cropRows);
}
