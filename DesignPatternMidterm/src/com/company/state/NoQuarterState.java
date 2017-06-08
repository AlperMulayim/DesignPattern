package com.company.state;

/**
 * Created by Alper on 7.12.2016.
 */
public class NoQuarterState implements State {

    GumbleMachine machine;

    public NoQuarterState(GumbleMachine machine){
        this.machine = machine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCherck() {

    }

    @Override
    public void dispense() {

    }
}
