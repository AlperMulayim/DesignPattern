package com.company.decorator;

/**
 * Created by Alper on 15.11.2016.
 */
public class Whiskey extends  CondimentDecorator {

    Beverage myBev;
    public  Whiskey(Beverage bvg){
        this.myBev = bvg;
    }

    @Override
    public String getDescription() {
        return myBev.getDescription() + "-" + "Whiskey";
    }

    @Override
    public double cost() {
        return 10 + myBev.cost();
    }
}
