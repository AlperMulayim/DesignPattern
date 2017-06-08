package com.company.decorator;

import com.company.decorator.Beverage;

/**
 * Created by Alper on 15.11.2016.
 */
public class IrishCoffee extends Beverage {

    public  IrishCoffee(){
        description = "Irish Coffee";
    }
    @Override
    public double cost() {
        return 4.20;
    }
}
