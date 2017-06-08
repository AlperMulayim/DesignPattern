package com.company.factory;

/**
 * Created by Alper on 15.11.2016.
 */
enum BusMarka {
    MERCEDES("Mercedes"),
    MAN("ManNeoplan"),
    TEMSA("Temsa");


    public  String name;

    BusMarka( String markaname){
        this.name = markaname;
    }

}
public class Bus {
    String marka;
    String model;
    double cost;
    double totalCost;
    int capacity;

    public Bus(String marka, String model, int capacity) {
        this.marka = marka;
        this.model = model;
        this.capacity = capacity;

        setTotalCost( calculateCost());
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double calculateCost(){
        double result = 0;

        if(getMarka().equals(BusMarka.MERCEDES.name)){
            result += 145000;
            setCost(145000);
        }

        else if(getMarka().equals(BusMarka.MAN.name)){
            result +=112000;
            setCost(112000);
        }
        else if(getMarka().equals(BusMarka.TEMSA.name)){
            result += 99900;
            setCost(99900);
        }

        double capacitCost = getCapacity() * 38.45;

        return result + capacitCost;
    }

    public String  toString()
    {
        StringBuilder strB = new StringBuilder();

        strB.append("marka    : " + getMarka());
        strB.append("\n");
        strB.append("model    : " + getModel());
        strB.append("\n");
        strB.append("hamcost  : " + getCost() + "$");
        strB.append("\n");
        strB.append("Capacity  : " + getCapacity() + " person");
        strB.append("\n");
        strB.append( "total    : " + getTotalCost() + " $" );
        strB.append("\n");

        return strB.toString();
    }

}
