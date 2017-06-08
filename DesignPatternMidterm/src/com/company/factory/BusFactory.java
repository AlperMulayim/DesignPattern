package com.company.factory;

/**
 * Created by Alper on 15.11.2016.
 */


public class BusFactory  extends  MyAbstractFactory{

    public Bus busFactoryMethod(String marka, String model, int capacity){
        return  new Bus(marka,model,capacity);
    }

    @Override
    public Truck truckFactoryMethod(String marka, String engine, double capacity) {
        return null;
    }

}
