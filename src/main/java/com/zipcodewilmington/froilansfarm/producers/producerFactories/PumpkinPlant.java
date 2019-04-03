package com.zipcodewilmington.froilansfarm.producers.producerFactories;

import com.zipcodewilmington.froilansfarm.producers.produce.Crop;
import com.zipcodewilmington.froilansfarm.producers.produce.Pumpkin;

public class PumpkinPlant extends Crop {
  //  private Boolean isFertilized;
    private Integer numberOfPumpkins;

    public PumpkinPlant(){
        super.setIsFertilized(false);
        this.numberOfPumpkins = 0;
    }

    public PumpkinPlant(Boolean isFertilized, Integer numberOfPumpkins){
        super.setIsFertilized(isFertilized);
        this.numberOfPumpkins = numberOfPumpkins;
    }


    public Integer getNumberOfPumpkins(){
        return this.numberOfPumpkins;
    }


    public void setNumberOfPumpkins (Integer numberOfPumpkins){
        this.numberOfPumpkins = numberOfPumpkins;
    }

    @Override
    public Pumpkin yield(){
        if (numberOfPumpkins != 0 && super.getIsFertilized()) {
            return new Pumpkin();
        }
        return null;
    }

}
