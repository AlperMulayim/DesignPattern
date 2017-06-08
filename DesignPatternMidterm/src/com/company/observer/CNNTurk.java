package com.company.observer;

/**
 * Created by Alper on 12.11.2016.
 */
public class CNNTurk extends  MyObserver {

    public CNNTurk(Subject sbj){
        this.subject = sbj;
        this.subject.attach(this);
    }
    @Override
    public void update() {

        System.out.println("\n...........CNN TURK..........");
        System.out.println("Son Dakika Haberleriyle Sizlerleyiz");

        System.out.println(subject.getNewHeader());
        System.out.println(subject.getNewDate());
        System.out.println(subject.getNewText());
        System.out.println(".....................................");
    }
}
