package com.company.template;

/**
 * Created by Alper on 2.01.2017.
 */
public class Farmer extends  Worker {


    public Farmer(String name, String sid, String depart) {
        super(name, sid, depart);
    }

    @Override
    public void getUp() {
        System.out.println("Get up 6:00 AM");
    }

    @Override
    public void goToWork() {
        System.out.println("Go farm at 6:30 AM");
    }

    @Override
    public void work() {
        System.out.println("Work in farm ");
    }

    @Override
    public void endWork() {
        System.out.println("Go home 11: 00  AM You will go again at 15:00 PM" );
    }
}
