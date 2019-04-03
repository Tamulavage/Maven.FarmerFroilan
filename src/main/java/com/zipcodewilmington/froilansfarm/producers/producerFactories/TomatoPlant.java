package com.zipcodewilmington.froilansfarm.producers.producerFactories;

import com.zipcodewilmington.froilansfarm.producers.produce.Crop;
import com.zipcodewilmington.froilansfarm.producers.produce.Tomato;
import com.zipcodewilmington.froilansfarm.storage.TomatoSilo;

public class TomatoPlant extends Crop {
        private Integer numberOfTomatoes;

        public TomatoPlant(){
            super.setIsFertilized(false);
            this.numberOfTomatoes = 0;
        }

        public TomatoPlant(Boolean isFertilized, Integer numberOfTomatoes){
            super.setIsFertilized(isFertilized);
            this.numberOfTomatoes = numberOfTomatoes;
        }


        public Integer getNumberOfTomatoes(){
            return this.numberOfTomatoes;
        }

        public void setNumberOfTomatoes (Integer numberOfTomatoes){
            this.numberOfTomatoes = numberOfTomatoes;
        }

        @Override
        public Tomato yield(){
            if (numberOfTomatoes != 0 && super.getIsFertilized()) {
                return new Tomato();
            }
            return null;
        }

    }
