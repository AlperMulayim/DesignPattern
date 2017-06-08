import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;


/**
 * Created by Alper Mulayim on 25.12.2016.
 */
public class RMIClient {

    static  String userName;
    static String userPasword;
    static  String userCreditPasword;
    static  String graphDataSend;
    static  RMIBulutCizgeAS rmiDemo;

    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {

        int menuGraphR;
        int menuGraphC;
        headerShow();
        String url = menuConnect();

        // test create user and login
        int menuWelcomeInp= menuWelcome();


        try{
        //connecting to server
        connectServer(url);

        // welocome menu process
        boolean menuWres = doMenuWelcomeProcess(menuWelcomeInp);

        while( true) {

            if (menuWres == false) {
                menuWelcomeInp = menuWelcome();
                menuWres = doMenuWelcomeProcess(menuWelcomeInp);
            } else {
                int menuUserInp = menuUser();
                int menuUserC = doMenuUser(menuUserInp);


                while (menuUserC == 1) {
                    menuUserInp = menuUser();
                    menuUserC = doMenuUser(menuUserInp);
                }

                if (menuUserC == 0) {
                    menuUserInp = menuUser();
                    menuUserC = doMenuUser(menuUserInp);

                } else if (menuUserC == 3) {
                    // menu graph
                    menuGraphR = graphMenu();
                    menuGraphC = doGraphMenuProcess(menuGraphR);

                    while (menuGraphC == 1) {
                        menuGraphR = graphMenu();
                        menuGraphC = doGraphMenuProcess(menuGraphR);
                    }

                } else {
                    // do the next menu
                    menuWres = false;
                }
            }

        }

        }
        catch (Exception e){
            System.err.println("\n--------------------------");
            System.err.println("There is Error ");
            System.err.println("Please run program again");
            System.err.println("--------------------------");
        }



    }

    public static  boolean doMenuWelcomeProcess(int menuWelcomeInp) throws RemoteException {
        boolean result = true;
        boolean userCreated = false;

        if (menuWelcomeInp == 1) {
            testBench();

        } else if (menuWelcomeInp == 2) {
            createUser();
            userCreated = true;
            result = true;


        } else if (menuWelcomeInp == 3) {
           loginUser();
            result = true;
        }
       else{
           result =  false;
        }
        return result;
    }

    public  static  void headerShow()
    {
        String str = "   _   _   _   _   _   _   _   _   _   _   _   _  \n" +
                "  / \\ / \\ / \\ / \\ / \\ / \\ / \\ / \\ / \\ / \\ / \\ / \\ \n" +
                " ( B | u | l | u | t | C | i | z | g | e | A | S )\n" +
                "  \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ " +
                "\n_________________________________________________";

        System.out.println(str);
    }


    public static  String  menuConnect()  {
        Scanner keyScan = new Scanner(System.in);
        String result = "urlnotfound";
        System.out.println("----------------------------------");
        System.out.println(" ### CONNECT ### ");
        System.out.println("Would you like to use on localhost");
        System.out.println("-----------------------------------");
        System.out.print("y , n  >> ");

        String control = keyScan.nextLine();


        if(  control.equals("y") ||  control.equals("yes")){
            System.out.println("Connecting localhost");

            result = new String("rmi://localhost/RMIBulutCizgeAS");

        }
        else if (control.equals("n") ||  control.equals("no") ){
            System.out.print("Enter Server IP >> ");
            String ip = keyScan.nextLine();
            result  = new String("rmi://" + ip + "/RMIBulutCizgeAS");

        }
        return  result;
    }


    public static  int menuWelcome()
    {
        System.out.println("----------------------------");
        System.out.println("1 . Test");
        System.out.println("2 . Create User");
        System.out.println("3 . Login");
        System.out.println("----------------------------");
        System.out.print("Please enter your process >> ");

        int  result = getMenuInput();
        return result;
    }

    public  static  int menuUser()
    {
        System.out.println("----------------------------");
        System.out.println("1 . Show User Properties");
        System.out.println("2 . Show Credit Details");
        System.out.println("3 . Graph");
        System.out.println("4 . Pay Credit");
        System.out.println("5 . Show Log");
        System.out.println("6 . Top Menu");
        System.out.println("----------------------------");
        System.out.print("Please enter your process >> ");
        int  result = getMenuInput();
        return result;
    }


    public static  int  doMenuUser(int menuInp) throws RemoteException {
        int result = 0;


        if(menuInp == 1){
            System.out.println("\n### USER DETAILS ### ");
            showUserProperties();
            result = 1;
        }
        else if(menuInp == 2){
            System.out.println("\n### CREDIT DETAILS ### ");
            showCreditCard();
            result =   1;
        }
        else if( menuInp == 3){
            System.out.println("\n### GRAPH MENU ### ");
            result = 3;
        }

        else  if(menuInp == 4){
            System.out.println("\n### CREDIT PAYMENT ###");
            loadMoneyToCard();
            result = 1;
        }
        else  if(menuInp == 5){
            System.out.println("\n### USER LOG ###");
            showUserLog();
            result = 1;
        }
        else if (menuInp == 6){
            result = 2;
        }
        return  result;
    }
    public  static  int getMenuInput()
    {
        Scanner keyScanner = new Scanner(System.in);
        int chose = keyScanner.nextInt();

        return  chose;
    }

    public static int graphMenu()
    {

        System.out.println("----------------------------");
        System.out.println("1 . Create Graph");
        System.out.println("2 . Add Element To Graph");
        System.out.println("3 . Show Graph Structure");
        System.out.println("4 . Show Dijikstra Report");
        System.out.println("5 . Find Shortest Path ");
        System.out.println("6 . Top Menu");
        System.out.println("----------------------------");
        System.out.print("Please Choose >> ");
        int  result = getMenuInput();
        return result;

    }

    public static  int doGraphMenuProcess(int input) throws RemoteException {

        int result = 0;

        if(input == 1){
            System.out.println("### CREATE GRAPH ###");
            createGraph();
            result = 1;
        }
        else if(input == 2){
            System.out.println("### ADD ELEMENT TO GRAPH ###");

            System.out.println(" a . Add Vertex");
            System.out.println(" x . Top Menu");
            System.out.println("Enter your process >> ");

            Scanner scn  = new Scanner(System.in);
            String addStr = scn.nextLine();

            while(addStr.equals("a")) {
                System.out.println("Add Element");

                Scanner scanP = new Scanner(System.in);
                System.out.println("#### Enter Vertex ####");
                System.out.print("Enter  N1  >>  ");
                int u = scanP.nextInt();
                System.out.print("Enter N2  >>  ");
                int v = scanP.nextInt();
                System.out.print("Enter C  >>  ");
                int c = scanP.nextInt();

                addElementToGraph(u,v,c);

                System.out.println(" a . Add Vertex");
                System.out.println(" x . Top Menu");
                System.out.println("Enter your process >> ");
                addStr = scn.nextLine();
            }

            result = 1;
        }
        else if(input == 3){
            System.out.println("### SHOW GRAPH DATA STRUCTURE ###");
            learnGraphStructure();
            result = 1;
        }
        else if(input == 4){
            System.out.println("### DIJIKSTRA REPORT  ###");
            showDijikstraReport();
            result = 1;
        }
        else if(input == 5){
            System.out.println("### SHORTEST PATH  ###");

            System.out.println("----------------------------");
            System.out.println(" s. Find Shortest Path");
            System.out.println(" x . Top Menu");
            System.out.println("Enter your process >> ");
            System.out.println("----------------------------");

            Scanner scn  = new Scanner(System.in);
            String addStr = scn.nextLine();

            while(addStr.equals("s")) {
                System.out.println("Enter Shortest Vertex ");

                Scanner scanP = new Scanner(System.in);
                System.out.println("#### Enter Node  ####");
                System.out.print("Enter  N1  >>  ");
                int u = scanP.nextInt();
                System.out.print("Enter N2  >>  ");
                int v = scanP.nextInt();


                showShortestPath(u,v);

                System.out.println("----------------------------");
                System.out.println(" a . Add Vertex");
                System.out.println(" x . Top Menu");
                System.out.println("Enter your process >> ");
                System.out.println("----------------------------");
                addStr = scn.nextLine();
            }
            result = 1;
        }
        else{
            System.out.println("### ust menu ###");
            result = 3;
        }

        return result;
    }

    public static  void connectServer(String url) throws RemoteException, NotBoundException, MalformedURLException {
        rmiDemo = (RMIBulutCizgeAS) Naming.lookup(url);
    }

    public static  void testBench() throws RemoteException {
        System.out.println("----------------------------");
        System.out.println("Testing for User");
        System.out.println("User Details");
        System.out.println("UserName : alper_mulayim ");
        System.out.println("Name     : Alper");
        System.out.println("Surname  : Mulayim");
        System.out.println("Email    : alpermulayim@gtu.edu.tr");
        System.out.println("Password : 123");
        System.out.println("\n");

        System.out.println("User Credit Details");
        System.out.println("Card Name: ISBANK DEBIT");
        System.out.println("Card Num : IS1234-1234-123");
        System.out.println("Balance  : 120");

        rmiDemo.createUser("alper_mulayim","alper","mulayim","123","alp@gtu.edu.tr","ISBANK MAXIMUM","IS1234-1234-123",120);
        userName = "alper_mulayim";
        userPasword =  "123";

        System.out.println("----------------------------");

        showUserProperties();
        showCreditCard();
        createGraph();


        addElementToGraph(1,2,50);
        addElementToGraph(0,1,10);
        addElementToGraph(0,4,100);
        addElementToGraph(2,4,10);
        addElementToGraph(0,3,30);
        addElementToGraph(3,2,20);
        addElementToGraph(3,4,60);

        learnGraphStructure();

        showUserLog();

        showDijikstraReport();

        showShortestPath(0,1);
        showShortestPath(0,4);
        showShortestPath(3,4);
        showShortestPath(3,2);
        showShortestPath(1,4);
        showShortestPath(0,2);

        showCreditCard();
        showUserLog();

        loadMoneyToCard(50);
        showCreditCard();
        showUserLog();
    }

    public static void createUser() throws RemoteException {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.print(".... Create  New User ....");

        System.out.print("\nUserName  >>");
        String username  = keyboardScanner.nextLine();

        System.out.print("Name  >>");
        String name  = keyboardScanner.nextLine();

        System.out.print("" +
                "Surname >>");
        String surname =  keyboardScanner.nextLine();

        System.out.print("Password >>");
        String password = keyboardScanner.nextLine();

        System.out.print("MailAdres >>");
        String mailAdres = keyboardScanner.nextLine();

        System.out.print("Creadit Card Name >>");
        String cardName = keyboardScanner.nextLine();

        System.out.print("Credit Card Number >>");
        String cardNumber = keyboardScanner.nextLine();

        //System.out.print("Creadit Card Passwprd >>");
        //String cardPass = keyboardScanner.nextLine();

        System.out.print("Credit Card Balance >>");
        String balance = keyboardScanner.nextLine();


        StringBuilder strB = new StringBuilder();

        strB.append("\nUserName :" + username);
        strB.append("\nName     : " + name);
        strB.append("\nSurname  : " + surname);
        strB.append("\nEmail    : " + mailAdres);
        strB.append("\nCard Name   : " + cardName);
        strB.append("\nCard Number :" + cardNumber);
        strB.append("\nCredit      :" + balance);
        strB.append("\n");

        System.out.println(strB.toString());
        System.out.println("Do you Confirm ? >> ");

        String confirm = keyboardScanner.nextLine();

        if(confirm.equals("y") || confirm.equals("yes")) {
            rmiDemo.createUser(username,name, surname, password, mailAdres, cardName, cardNumber, Double.parseDouble(balance));
            userName = username;
            userPasword = password;
        }
        else{
            System.out.println("Cancelled");
        }

    }

    public static void  loginUser() throws RemoteException {
        Scanner keyboardScanner = new Scanner(System.in);
        boolean logStatus = false;

        while (logStatus == false) {
            System.out.println("\n..... : LOGIN : .....");
            System.out.print("\nName >> ");
            userName = keyboardScanner.nextLine();
            System.out.print("Pasword >> ");
            userPasword = keyboardScanner.nextLine();

            if (rmiDemo.getUserProperties(userName,userPasword).equals("notfound")) {
                System.out.println("!!username or password invalid!!");
                logStatus = false;
            } else {
                System.out.println("\n....: WELCOME BulutCizgeAS :....");
                System.out.println(rmiDemo.getUserProperties(userName,userPasword));
                logStatus = true;
            }
        }
    }

    public static void  loadMoneyToCard(double money) throws RemoteException {
        String creditStatus = rmiDemo.getCreditCardProperties(userName,userPasword);
        while(creditStatus.equals("notfound")){
            System.out.println("You have not login");
            loginUser();
            creditStatus = rmiDemo.getCreditCardProperties(userName,userPasword);
        }

        rmiDemo.payCredit(userName,userPasword,money);

    }

    public static void loadMoneyToCard() throws RemoteException {

            String creditStatus = rmiDemo.getCreditCardProperties(userName,userPasword);

            while(creditStatus.equals("notfound")){
                System.out.println("You have not login");
                loginUser();
                creditStatus = rmiDemo.getCreditCardProperties(userName,userPasword);
            }

                System.out.print(creditStatus);
                Scanner keyScan = new Scanner(System.in);

                System.out.print("\nEnter Cost to Pay >>");
                double loadVal = keyScan.nextDouble();
                rmiDemo.payCredit(userName,userPasword,loadVal);

                System.out.println("Card Credit UP-TO-DATE");
    }

    public static void createGraph() throws RemoteException {
        rmiDemo.createGraph(userName);
    }

    public  static void addElementToGraph(int first, int secand, int cost) throws RemoteException {

        rmiDemo.addElementToGraph(userName,first,secand,cost);

    }

    public static  void learnGraphStructure() throws RemoteException{
          String result =   rmiDemo.getGraphStructure(userName);

            System.out.println(result);
    }
    public static  void showDijikstraReport() throws  RemoteException
    {
        String result = rmiDemo.getDijikstraReport(userName);
        System.out.println(result);
    }

    public static void showShortestPath(int start , int end) throws RemoteException {
        String result = rmiDemo.getShortestPath(userName,start,end);
        System.out.println(result);
    }

    public static void showCreditCard() throws RemoteException {
        String cardProp = rmiDemo.getCreditCardProperties(userName,userPasword);
        System.out.println(cardProp);
    }

    public static  void showUserLog() throws RemoteException {
        String userLog = rmiDemo.getUserLog(userPasword);
        System.out.println(userLog);
    }
    public static  void showUserProperties() throws  RemoteException{
        String userProb = rmiDemo.getUserProperties(userName,userPasword);
        System.out.println(userProb);
    }
}
