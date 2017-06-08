package com.company.decorator;

/**
 * Created by Alper on 15.11.2016.
 */
public class Milk extends CondimentDecorator {

    Beverage myBeverage;
    public Milk(Beverage bvg){
        myBeverage = bvg;
    }
    @Override
    public String getDescription() {
        return myBeverage.getDescription() + "-" +"milk";
    }

    @Override
    public double cost() {
        return 0.55 + myBeverage.cost();
    }
}
