package com.company.adapter;

import com.sun.javafx.geom.*;
import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Alper on 4.01.2017.
 */
public class Calculator {
    public  Rect rectangle;

    public int getArea(Rect r)
    {
        rectangle = r;
        return rectangle.l * rectangle.w;
    }
}
