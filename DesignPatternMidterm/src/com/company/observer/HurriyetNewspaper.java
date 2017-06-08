package com.company.observer;

/**
 * Created by Alper on 12.11.2016.
 */
public class HurriyetNewspaper extends MyObserver{

    public HurriyetNewspaper(Subject subjectA){
        this.subject = subjectA;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("\n___________HURRIYET_________");
        System.out.println("\tSON DAKIKA");


        System.out.println(subject.getNewHeader());
        System.out.println(subject.getNewDate());
        System.out.println(subject.getNewText());
        System.out.println("_______________________________");
    }
}
