import Factory.EUPhoneFactory;
import Factory.GlobalFactory;
import Factory.PhoneComponentFactory;
import Factory.TurkeyPhonefFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PhoneComponentFactory myFact;

        Scanner keyScan = new Scanner(System.in);

        showMenu();
        int input = keyScan.nextInt();

        while(input < 4) {

            if (input == 1) {
                myFact = new TurkeyPhonefFactory("MaximumEffort");
                myFact.doManifactoring();

                myFact = new TurkeyPhonefFactory("IflasDelux");
                myFact.doManifactoring();

                myFact = new TurkeyPhonefFactory("IAmanIflas");
                myFact.doManifactoring();

            } else if (input == 2) {
                myFact = new EUPhoneFactory("MaximumEffort");
                myFact.doManifactoring();

                myFact = new EUPhoneFactory("IflasDelux");
                myFact.doManifactoring();

                myFact = new EUPhoneFactory("IAmanIflas");
                myFact.doManifactoring();

            } else if (input == 3) {

                myFact = new GlobalFactory("MaximumEffort");
                myFact.doManifactoring();

                myFact = new GlobalFactory("IflasDelux");
                myFact.doManifactoring();

                myFact = new GlobalFactory("IAmanIflas");
                myFact.doManifactoring();
            }

            showMenu();
            input = keyScan.nextInt();
        }

    }

    public  static  void showMenu()
    {
        System.out.println("\n\n# IFLAS TECHNOLOGIES LTD #");
        System.out.println("1 . Turkey Factory");
        System.out.println("2 . EU Factory");
        System.out.println("3 . Global Factory");
        System.out.println("4 . Exit");
        System.out.print("Please enter your factory  >> ");
    }
}
