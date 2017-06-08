package com.company.decorator;

/**
 * Created by Alper on 15.11.2016.
 */
public class Lokum extends  CondimentDecorator {

    Beverage myBeverage;

    public Lokum(Beverage bevg){

        this.myBeverage = bevg;
    }

    @Override
    public String getDescription() {
        return myBeverage.getDescription() + "-" + "lokum";
    }

    @Override
    public double cost() {
        return 1.45 + myBeverage.cost() ;
    }
}
