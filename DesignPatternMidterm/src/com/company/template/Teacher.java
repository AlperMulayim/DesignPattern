package com.company.template;

/**
 * Created by Alper on 25.11.2016.
 */
public class Teacher extends Worker {

    public Teacher(String name,String sid)
    {
        super(name,sid,"Teacher");
    }
    @Override
    public void getUp() {
        System.out.println("Get up at 7:30 AM ");
    }

    @Override
    public void goToWork() {
        System.out.println("Go to School at 8:15 AM");
    }

    @Override
    public void work() {
        System.out.println("Teach your subjects to Students and make exam.");
    }

    @Override
    public void endWork() {
        System.out.println("End work at 15:30 PM  leave school at 15:45 PM go to home");
    }


}
