package com.company.decorator;

/**
 * Created by Alper on 15.11.2016.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public  String  getDescription()
    {
        return description;
    }
    public abstract double cost();

}
