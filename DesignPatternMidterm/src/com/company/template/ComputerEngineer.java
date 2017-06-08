package com.company.template;

/**
 * Created by Alper on 25.11.2016.
 */
public class ComputerEngineer extends  Worker {
    public ComputerEngineer(String name , String sid)
    {
        super(name,sid,"Computer Engineer");
    }
    @Override
    public void getUp() {
        System.out.println("Get up at 9:00 AM or get up when you want :D if you want sleep bro");
    }

    @Override
    public void goToWork() {
        System.out.println("Go to work by bus at 10:00 AM");
    }

    @Override
    public void work() {
        System.out.println("First drink coffee, Control the logs and CODE");
    }

    @Override
    public void endWork() {
        System.out.println("Do your deadlines until 6:00 PM, Go home and continue deadlines end");
    }
}
