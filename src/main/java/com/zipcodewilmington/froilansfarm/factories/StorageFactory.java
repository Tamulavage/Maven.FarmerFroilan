package com.zipcodewilmington.froilansfarm.factories;


import com.zipcodewilmington.froilansfarm.storage.*;

import java.util.ArrayList;
import java.util.List;

public class StorageFactory {

    public static ArrayList<ChickenCoops> createMultiChickenCoops(Integer amount) {
        ArrayList<ChickenCoops> chickenCoops = new ArrayList<ChickenCoops>();

        for(int i = 0; i<amount; i++){
            chickenCoops.add(new ChickenCoops());
        }

        return chickenCoops;
    }

    public static ChickenCoops createSingleChickenCoop() {
        ChickenCoops chickenCoop = createMultiChickenCoops(1).get(0);

        return chickenCoop;
    }

    public static EggBasket createEggBasket(Integer amountOfEggs){
        List<EggBasket> eggBasket = new ArrayList<>();

        for(int i = 0; i < amountOfEggs; i++){
            eggBasket.add(new EggBasket());
        }
        return (EggBasket) eggBasket;
    }

    public static ArrayList<CornSilo> createMultiCornSilos(Integer amount) {
        ArrayList<CornSilo> cornSilos = new ArrayList<CornSilo>();

        for(int i = 0; i<amount; i++){
            cornSilos.add(new CornSilo());
        }

        return cornSilos;
    }

    public static CornSilo createSingleCornSilo() {
        CornSilo cornSilo = createMultiCornSilos(1).get(0);

        return cornSilo;
    }

    public static ArrayList<CropRows> createMultiCropRows(Integer amount) {
        ArrayList<CropRows> cropRows = new ArrayList<CropRows>();

        for(int i = 0; i<amount; i++){
            cropRows.add(new CropRows());
        }

        return cropRows;
    }

    public static CropRows createSingleCropRow() {
        CropRows cropRows = createMultiCropRows(1).get(0);

        return cropRows;
    }


    public static ArrayList<PumpkinSilo> createMultiPumkinSilos(Integer amount) {
        ArrayList<PumpkinSilo> pumpkinSilos = new ArrayList<PumpkinSilo>();

        for(int i = 0; i<amount; i++){
            pumpkinSilos.add(new PumpkinSilo());
        }

        return pumpkinSilos;
    }

    public static PumpkinSilo createSinglePumkinSilo() {
        PumpkinSilo pumpkinSilo = createMultiPumkinSilos(1).get(0);

        return pumpkinSilo;
    }

    public static ArrayList<Stables> createMultiStables(Integer amount) {
        ArrayList<Stables> stables = new ArrayList<Stables>();

        for(int i = 0; i<amount; i++){
            stables.add(new Stables());
        }

        return stables;
    }

    public static Stables createSingleStables() {
        Stables stables = createMultiStables(1).get(0);

        return stables;
    }

    public static ArrayList<TomatoSilo> createMultiTomatoSilos(Integer amount) {
        ArrayList<TomatoSilo> tomatoSilos = new ArrayList<TomatoSilo>();

        for(int i = 0; i<amount; i++){
            tomatoSilos.add(new TomatoSilo());
        }

        return tomatoSilos;
    }

    public static TomatoSilo createSingleTomatoSilo() {
        TomatoSilo tomatoSilo = createMultiTomatoSilos(1).get(0);

        return tomatoSilo;
    }
}
