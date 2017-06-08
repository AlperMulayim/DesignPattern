package com.company.proxy;

/**
 * Created by Alper on 2.01.2017.
 */
public class RealImage implements  Image {

    String name;
    public RealImage(String name){
        this.name = name;
        loadFromDisk();
    }
    @Override
    public void display() {
        System.out.println("Display " + name);
    }

    public void loadFromDisk(){
        System.out.println("Loading " + name);
    }
}
