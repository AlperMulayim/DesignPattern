package com.company.decorator;

import com.company.decorator.Beverage;

/**
 * Created by Alper on 15.11.2016.
 */
public class TurkishCoffee  extends Beverage {

    public TurkishCoffee(){
        description = "Turkish Coffee";
    }
    @Override
    public double cost() {
        return 2.5;
    }
}
