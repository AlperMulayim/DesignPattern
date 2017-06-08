package com.company.singelton;

/**
 * Created by Alper on 15.11.2016.
 */
public class SingletonBus {
    private  static SingletonBus uniqueInstance = new SingletonBus();

    public static  SingletonBus getUniqueInstance()
    {
        return uniqueInstance;
    }

    private SingletonBus(){};

    public void showMessage()
    {
        System.out.println("Hello Singletoon");
    }

}
