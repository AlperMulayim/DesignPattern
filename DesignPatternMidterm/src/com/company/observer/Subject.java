package com.company.observer;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Alper on 12.11.2016.
 */
public class Subject {
    private List<MyObserver> observers = new ArrayList<MyObserver>();

    public String getNewHeader()
    {
        return  agandaNews.getNewsHeader();
    }
    public String getNewText()
    {
        return  agandaNews.getNewsText();
    }

    public  String getNewDate(){
        return agandaNews.getNewsDate();
    }

    public void setNews(AgandaNews state){
        this.agandaNews = state;
        notifyAllObservers();
    }

    private AgandaNews agandaNews;

    public void attach(MyObserver myobserver){
        observers.add(myobserver);
    }

    public  void notifyAllObservers(){
        for(MyObserver observer : observers){
            observer.update();
        }
    }
}
