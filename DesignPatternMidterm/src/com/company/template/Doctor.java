package com.company.template;

/**
 * Created by Alper on 25.11.2016.
 */
public class Doctor extends  Worker {
    public  Doctor(String name, String sid)
    {
        super(name,sid,"Doctor");
    }
    @Override
    public void getUp() {
        System.out.println("Get up at 8:15 AM");
    }

    @Override
    public void goToWork() {
        System.out.println("Go to Hospital at 9:00 AM");
    }

    @Override
    public void work() {
        System.out.println("Control your patients Do treatment patients , be ready for mediacal case");
    }

    @Override
    public void endWork() {
        System.out.println("Control your patients go home at 6:00PM be ready for mediacal case");
    }
}
