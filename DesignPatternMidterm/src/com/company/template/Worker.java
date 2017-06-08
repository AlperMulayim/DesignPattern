package com.company.template;

/**
 * Created by Alper on 25.11.2016.
 */
public abstract class Worker {

    String name;
    String sid;
    String depart;

    public Worker(String name, String sid,String depart) {
        this.name = name;
        this.sid = sid;
        this.depart = depart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public abstract  void getUp();
    public abstract  void goToWork();
    public abstract  void work();
    public abstract  void endWork();

    public void eatBreaksfast(){
        System.out.println("Make Breakfast");
    }

    public  void relax()
    {
        System.out.println("Relax");
    }

    public  void description()
    {
        System.out.println("-------------------");
        System.out.println("Job : " + depart);
        System.out.println("Name: " + name);
        System.out.println("SID : " + sid);
    }
    public final  void dailyRoutine()
    {
        description();
        getUp();
        eatBreaksfast();
        goToWork();
        work();
        endWork();
        relax();
    }
}
