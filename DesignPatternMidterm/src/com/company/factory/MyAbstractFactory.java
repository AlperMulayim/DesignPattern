package com.company.factory;

/**
 * Created by Alper on 15.11.2016.
 */
public abstract class MyAbstractFactory {

    public  abstract Bus busFactoryMethod(String marka, String model, int capacit);
    public abstract Truck truckFactoryMethod(String marka, String engine,double capacity);
}
