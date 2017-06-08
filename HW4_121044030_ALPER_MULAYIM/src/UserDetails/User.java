package UserDetails;

import MethodDetails.BulutMethod;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alper on 25.12.2016.
 */
public class User {
    private String email;
    private String pasword;
    private String name;
    private  String username;
    private String surname;
    private CreditCard creditCard;
    private List<BulutMethod> methodLog;


    public User(String username, String name, String surname, String email, String pasword, CreditCard creditCard) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.pasword = pasword;
        this.creditCard = creditCard;
        this.username = username;
        this.methodLog= new LinkedList();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }


    public String toString()
    {
        StringBuilder strB = new StringBuilder();

        strB.append("\nUserName : " + getUsername());
        strB.append("\nName     : " + getName());
        strB.append("\nSurname  : " + getSurname());
        strB.append("\nEmail    : " + getEmail());
        strB.append("\n");
        return strB.toString();
    }

    public void addLog(BulutMethod method){
        method.setMoney(getCreditCard().getUsedMoney());
        methodLog.add(method);
    }

    public  List<BulutMethod> getMethodLog() {
        return  methodLog;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void payForRequest(double cost){
        getCreditCard().setUsedMoney(getCreditCard().getUsedMoney() - cost);
    }


}
