package com.company.decorator;

import com.company.decorator.Beverage;

/**
 * Created by Alper on 15.11.2016.
 */
public abstract class CondimentDecorator  extends Beverage {
    public  abstract  String getDescription();
}
