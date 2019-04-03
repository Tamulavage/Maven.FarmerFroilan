package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Edible;
import com.zipcodewilmington.froilansfarm.producers.produce.Crop;
import com.zipcodewilmington.froilansfarm.producers.produce.Tomato;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.CornStalk;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.PumpkinPlant;
import com.zipcodewilmington.froilansfarm.producers.producerFactories.TomatoPlant;
import com.zipcodewilmington.froilansfarm.storage.Storage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class CropRows implements Storage<Crop> {
    private List<Crop> cropList;

    public CropRows(){
        cropList = new ArrayList<>();
    }

    public CropRows(List<Crop> cropList){
        this.cropList = cropList;
    }

    public List<Crop> getCropList(){
        return this.cropList;
    }

    public Integer getNumberOfCrops(){
        if (cropList.size() != 0) {
            return cropList.size();
        }
        return null;
    }

    public void add(Crop crop) {
        if(crop instanceof CornStalk) {
            cropList.add(new CornStalk());
        } else if (crop instanceof TomatoPlant){
            cropList.add(new TomatoPlant());
        } else if (crop instanceof PumpkinPlant){
            cropList.add(new PumpkinPlant());
        }
    }

    public void removeAll() {
        cropList.clear();
    }

}
