package com.company.decorator;

/**
 * Created by Alper on 2.01.2017.
 */
public class Cake extends CondimentDecorator {

    Beverage bevg;
    public Cake(Beverage bev) {
        this.bevg = bev;
    }

    @Override
    public String getDescription() {
         return bevg.getDescription() + "-" + "Cake";
    }

    @Override
    public double cost() {
        return 10.50 + bevg.cost();
    }
}
