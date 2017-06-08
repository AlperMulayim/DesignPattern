package com.company.factory;

/**
 * Created by Alper on 15.11.2016.
 */

enum Marka {
    MERCEDES("Mercedes"),
    VOLVO("Volvo"),
    DAF("Daf"),
    MAN("Man");

    public  String name;

    Marka( String markaname){
        this.name = markaname;
    }


}
public class Truck  {

    double cost;
    String marka;
    String engine;
    double loadCapacity;
    double hamCost;

    public Truck(String marka, String engine, double loadCapacity) {
        this.marka = marka;
        this.engine = engine;
        this.loadCapacity = loadCapacity;

        setCost(calculateCost());
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double calculateCost(){
        double result = 0;

        if(getMarka().equals(Marka.MERCEDES.name)){
            result += 135000;
            hamCost = 135000;
        }
        else if(getMarka().equals(Marka.DAF.name)){
            result += 97000;
            hamCost = 97000;
         }
        else if(getMarka().equals(Marka.MAN.name)){
             result +=100000;
            hamCost = 100000;
        }
        else if(getMarka().equals(Marka.VOLVO.name)){
            result += 115000;
            hamCost = 115000;
        }

        double capacitCost = getLoadCapacity() * 0.2;

        return result + capacitCost;
    }
    
    public String  toString()
    {
        StringBuilder strB = new StringBuilder();
        
        strB.append("marka    : " + getMarka());
        strB.append("\n");
        strB.append("model    : " + getEngine());
        strB.append("\n");
        strB.append("hamcost  : " + hamCost + "$");
        strB.append("\n");
        strB.append("loadcap  : " + getLoadCapacity() + " kg");
        strB.append("\n");
        strB.append( "total    : " + getCost() + " $" );
        strB.append("\n");

        return strB.toString();
    }
}
