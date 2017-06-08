package com.company.adapter;

/**
 * Created by Alper on 4.01.2017.
 */
public class CalculatorAdapter {
    Calculator calculator;
    Triangle triangle;

    public int getArea(Triangle t)
    {
        calculator = new Calculator();
        triangle = t;

        Rect rect = new Rect();
        rect.w = triangle.b;
        rect.l = (int) (0.5 * triangle.h);

        return calculator.getArea(rect);
    }
}
