package com.company.singelton;

/**
 * Created by Alper on 15.11.2016.
 */
public class SingeltonAlp {
    private  SingeltonAlp(){};

    private static SingeltonAlp instance = new SingeltonAlp();

    public  static  SingeltonAlp getInstance(){
        return  instance;
    }

    public  void showMessage()
    {
        System.out.println("Helloo SingeltonAlp");
    }
}
