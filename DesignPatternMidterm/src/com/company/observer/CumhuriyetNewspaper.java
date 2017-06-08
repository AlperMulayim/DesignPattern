package com.company.observer;

/**
 * Created by Alper on 15.11.2016.
 */
public class CumhuriyetNewspaper extends MyObserver {

    public  CumhuriyetNewspaper(Subject subject)
    {
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("\n---------CUMHURIYET----------");
        System.out.println("SON DAKIKA");

        System.out.println(subject.getNewHeader());
        System.out.println(subject.getNewText());
        System.out.println(subject.getNewDate());
        System.out.println("---------------------");

    }
}
