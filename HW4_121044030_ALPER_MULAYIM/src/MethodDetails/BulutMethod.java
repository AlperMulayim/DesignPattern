package MethodDetails;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Alper on 26.12.2016.
 */
public class BulutMethod {
    private String methodName;
    private Date callTime;
    private Date responsTime;
    private double money;
    private  double cost;




    public BulutMethod(String methodName, Date callTime) {
        this.methodName = methodName;
        this.callTime = callTime;
        this.responsTime = callTime;
        this.cost = 0;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Date getCallTime() {
        return callTime;
    }

    public void setCallTime(Date callTime) {
        this.callTime = callTime;
    }

    public Date getResponsTime() {
        return responsTime;
    }

    public void setResponsTime(Date responsTime) {
        this.responsTime = responsTime;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String toString()
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a");

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(getMethodName());
        stringBuilder.append("\t");
        stringBuilder.append(dateFormat.format(getCallTime()));
        stringBuilder.append("\t");
        stringBuilder.append(dateFormat.format(getResponsTime()));
        stringBuilder.append("\t");
        stringBuilder.append(getCost());
        stringBuilder.append("\t");
        stringBuilder.append( String.format(  "%.2f" ,getMoney()));
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}
