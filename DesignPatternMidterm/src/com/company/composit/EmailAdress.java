package com.company.composit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alper on 24.11.2016.
 */
public class EmailAdress {
    String name;
    String mailAdress;
    List<EmailAdress> addressList = new ArrayList<>();

    public EmailAdress(String name, String mailAdress) {
        this.name = name;
        this.mailAdress = mailAdress;
        addressList = new ArrayList<>();
    }

    public void addMailAdress(EmailAdress mailAdres)
    {
        addressList.add(mailAdres);
    }

    public  void  removeMailAdress(EmailAdress emailAdress)
    {
        addressList.remove(emailAdress);
    }

    public  List<EmailAdress> getAddressList()
    {
        return  addressList;
    }

    public  String toString()
    {
        return ( mailAdress + " " + name);
    }

    public void printEmailBook(EmailAdress mailAdress)
    {
        for(EmailAdress adres :mailAdress.getAddressList()){
            System.out.println("\t" +adres);

            for(EmailAdress adr : adres.getAddressList()){
                System.out.println( "\t\t" +  adr);
            }
        }
    }

}
