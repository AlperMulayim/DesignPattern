

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alper on 24.11.2016.
 */

public class EmailAdress {

    private String name;
    private String mailDomain;
    private String mailAdress;
    private List<EmailAdress> addressList = new ArrayList<>();

    public EmailAdress(String name, String mailDomain) {
        this.name = name;
        this.mailDomain = mailDomain;
        this.mailAdress = name.toLowerCase().replaceAll("\\s","") +"@" + mailDomain;
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
            System.out.println(adres);
            mailAdress.printEmailBook(adres);
        }
    }

    public static void main(String[] args) {

        EmailAdress GTUadres = new EmailAdress("GTU Mail Center","gtu.edu.tr");
        EmailAdress bilmuh = new EmailAdress("Computer Engineering","gtu.edu.tr");
        EmailAdress bilmuhStudents = new EmailAdress("Computer Students","gtu.edu.tr");
        EmailAdress spake = new EmailAdress("Spake Mayer","gmail.com");
        EmailAdress  marleen = new EmailAdress("Marleen Curtis","live.com");
        EmailAdress elecmuh = new EmailAdress("Electronic Engineering","gtu.edu.tr");
        EmailAdress steve = new EmailAdress("Steve Stevenson","gtu.edu.tr");
        EmailAdress mahmut = new EmailAdress("Mahmut Mahmutoglu","gmail.com");
        EmailAdress bilmuhInstructors = new EmailAdress("Computer Instructors","gtu.edu.tr");
        EmailAdress elecStudents = new EmailAdress("Electronic Students","gtu.edu.tr");
        EmailAdress casey = new EmailAdress("Casey Sidney","gmail.com");
        EmailAdress sharla = new EmailAdress("Sharla Alvey","live.com");
        EmailAdress bonita = new EmailAdress("Bonita Killam","hotmail.com");
        EmailAdress elecMuhIns = new EmailAdress("Electronic Instructors","gtu.edu.tr");
        EmailAdress  jany = new EmailAdress("Janey Kynaston","gtu.edu.tr");

        System.out.println(GTUadres);

        //departments
        GTUadres.addMailAdress(bilmuh);
        GTUadres.addMailAdress(elecmuh);

        //student group
        bilmuh.addMailAdress(bilmuhStudents);
        elecmuh.addMailAdress(elecStudents);

        //instructor group
        bilmuh.addMailAdress(bilmuhInstructors);
        elecmuh.addMailAdress(elecMuhIns);

        //students
        bilmuhStudents.addMailAdress(spake);
        bilmuhStudents.addMailAdress(marleen);
        elecStudents.addMailAdress(casey);
        elecStudents.addMailAdress(sharla);


        //instructors
        bilmuhInstructors.addMailAdress(steve);
        bilmuhInstructors.addMailAdress(mahmut);
        elecMuhIns.addMailAdress(bonita);
        elecMuhIns.addMailAdress(jany);

        GTUadres.printEmailBook(GTUadres);
    }
}
