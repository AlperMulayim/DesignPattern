package com.company.factory;

/**
 * Created by Alper on 15.11.2016.
 */
public class TruckFactory  extends  MyAbstractFactory{

    @Override
    public Bus busFactoryMethod(String marka, String model, int capacit) {
        return null;
    }

    public Truck truckFactoryMethod(String name, String engine, double capacity){
        return new Truck(name,engine,capacity);
    }

}
