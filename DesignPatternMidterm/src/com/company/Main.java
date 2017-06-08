package com.company;

import com.company.adapter.CalculatorAdapter;
import com.company.adapter.Triangle;
import com.company.composit.EmailAdress;
import com.company.composit.Employee;
import com.company.decorator.*;
import com.company.proxy.Image;
import com.company.proxy.ProxyImage;
import com.company.singelton.SingletonBus;
import com.company.observer.*;
import com.company.factory.*;
import com.company.singelton.SingeltonAlp;
import com.company.template.*;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        //factoryTest();
        // decoratorPatternTest();


        observerPatternTest();

        //factoryAbstractTest();

        //compositPattern();

        //testTemplate();
        //testTemplate();
        proxyTest();

        adapterTest();

    }


    public static  void adapterTest()
    {
        CalculatorAdapter calA = new CalculatorAdapter();
        Triangle t = new Triangle(4,6);

       System.out.println("Area  :  " +  calA.getArea(t));


    }

    public static void proxyTest()
    {
        Image img = new ProxyImage("alp.jpg");
        img.display();
        img.display();
    }

    public static void observerPatternTest()
    {
        Subject newSubject = new Subject();

        new HurriyetNewspaper(newSubject);
        new CNNTurk(newSubject);
        new CumhuriyetNewspaper(newSubject);

        String header = "DOLAR ALDI BAŞINI GITTI";
        String date = "11.11.16 17:34";
        String text = "Dolar gune yukselisle basladı ve\n3.34 ile su an tarihi rekor kirdi.";
        AgandaNews breakingNews = new AgandaNews(header,text,date);
        newSubject.setNews(breakingNews);
        newSubject.setNews(breakingNews);
    }

    public static  void  decoratorPatternTest()
    {
        DecimalFormat myDecFormat = new DecimalFormat("0.00");
        Beverage myBevg = new TurkishCoffee();
        myBevg = new Lokum(myBevg);
        myBevg = new Milk(myBevg);


        Beverage secBevg = new IrishCoffee();
        secBevg = new Whiskey(secBevg);
        secBevg = new Lokum(secBevg);
        secBevg = new Cake(secBevg);

        System.out.println("Order : " +  myBevg.getDescription());
        System.out.println("Total : "  + "$" + myDecFormat.format( myBevg.cost()));
        System.out.println("Order : "  + secBevg.getDescription());
        System.out.println("Total : " + "$" + myDecFormat.format(secBevg.cost()));
    }

    public static  void singletonTest()
    {
        SingletonBus singleBus = SingletonBus.getUniqueInstance();
        singleBus.showMessage();

        SingeltonAlp alp = SingeltonAlp.getInstance();
        alp.showMessage();
    }

    public static void factoryTest(){
        TruckFactory theFactory = new TruckFactory();

        Truck myTruck = theFactory.truckFactoryMethod("Man","TGA1800",45000);
        Truck myTruck2 = theFactory.truckFactoryMethod("Mercedes","Actros",56000);
        System.out.println( myTruck.toString());
        System.out.println(myTruck2.toString());
    }

    public static  void factoryAbstractTest()
    {
        MyAbstractFactory absFactory = new BusFactory();
        Bus soldBus = absFactory.busFactoryMethod("Mercedes","Travego",56);
        System.out.println(soldBus.toString());

        soldBus = absFactory.busFactoryMethod("Temsa","Maraton",45);
        System.out.println(soldBus.toString());

        soldBus = absFactory.busFactoryMethod("Mercedes","Tourismo",52);
        System.out.println(soldBus.toString());

        MyAbstractFactory myTruckFactory = new TruckFactory();
        Truck soldTruck  = myTruckFactory.truckFactoryMethod("Man","TGA1800",45600);
        System.out.println(soldTruck.toString());
        System.out.println(soldTruck.toString());
    }

    public static void compositPattern()
    {
        Employee CEO = new Employee("alper","CEO",300000);
        Employee headDir = new Employee("ali","HEAD DIR",20000);
        Employee salesDir = new Employee("hasan","SALES DIR",20000);
        Employee cayci = new Employee("mahmut","CAYCI",3000);

        CEO.add(headDir);
        CEO.add(headDir);
        CEO.add(salesDir);

        headDir.add(cayci);
        headDir.add(cayci);
        headDir.add(cayci);
        System.out.println(CEO);

        for (Employee headEmployee : CEO.getEmployeList()) {
            System.out.println("\t" +headEmployee);

            for (Employee employee : headEmployee.getEmployeList()) {
                System.out.println("\t\t" + employee);
            }
        }

    }

    public  static  void testEmailList()
    {
        EmailAdress GTUadres = new EmailAdress("GTU","info@gtu.edu.tr");

    }

    public static void testTemplate()
    {
        Worker saadet = new Teacher("Saadet Mulayim","10103040");
        Worker alper = new ComputerEngineer("Alper Mulayim","121044030");
        Worker aliburak  = new Doctor("Ali Burak Mulayim","13432425");
        Worker alp = new Farmer("Alp", "Mulayim","233243243");

        saadet.dailyRoutine();
        alper.dailyRoutine();
        aliburak.dailyRoutine();
        alp.dailyRoutine();
    }
}
