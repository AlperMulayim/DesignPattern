package com.company.state;

/**
 * Created by Alper on 7.12.2016.
 */
public class GumbleMachine {
    final static int SOLD_OUT =0;
    final  static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static  int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0 ;

    public GumbleMachine(int count){
        this.count = count;
        if(count > 0){
            state = NO_QUARTER;
        }
    }

    public void setState( int state)
    {
        this.state = state;
    }

}
