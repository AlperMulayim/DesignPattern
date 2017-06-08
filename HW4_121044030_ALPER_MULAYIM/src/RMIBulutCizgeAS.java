import UserDetails.CreditCard;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Alper on 25.12.2016.
 */
public interface RMIBulutCizgeAS extends Remote  {

    String getUserName(String password) throws RemoteException;
    boolean createUser(String username,
                       String name,
                       String surname,
                       String password,
                       String mailAdress,
                       String cardName,
                       String cardNumber,
                       double cardCredit)  throws  RemoteException;

    String getUserProperties(String username, String password) throws  RemoteException;
    String getCreditCardProperties(String username,String usrPasword) throws RemoteException;
    String getUserLog(String userPasword) throws  RemoteException;
    void payCredit(String username,String userPasword,double cost) throws RemoteException;
    void createGraph(String username) throws  RemoteException;
    void addElementToGraph(String username,int first, int secand,int cost) throws RemoteException;
    String getGraphStructure(String username) throws  RemoteException;
    String getDijikstraReport(String username) throws  RemoteException;
    String getShortestPath(String username,int start, int end) throws  RemoteException;
};


