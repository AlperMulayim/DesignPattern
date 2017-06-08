package com.company.decorator;

import com.company.decorator.Beverage;

/**
 * Created by Alper on 15.11.2016.
 */
public class Latte extends Beverage {

    public  Latte(){
        description = "Latte";
    }
    @Override
    public double cost() {
        return 1.5;
    }
}
