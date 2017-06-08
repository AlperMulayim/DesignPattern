package com.company.proxy;

/**
 * Created by Alper on 2.01.2017.
 */
public class ProxyImage implements Image{
    RealImage image;
    String filename;

    public ProxyImage(String filename)
    {
        this.filename = filename;

    }

    @Override
    public void display() {

        if(image == null){
            image = new RealImage(filename);
        }

        image.display();
    }
}
