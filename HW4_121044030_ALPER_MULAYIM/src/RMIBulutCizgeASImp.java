import MethodDetails.BulutMethod;
import UserDetails.CreditCard;
import UserDetails.User;
import graph.DijikstraTable;
import graph.DijkstrasAlgorithm;
import graph.Edge;
import graph.Graph;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alper on 25.12.2016.
 */
public class RMIBulutCizgeASImp extends UnicastRemoteObject implements  RMIBulutCizgeAS {

    public List<User> userList = new LinkedList();
    public List<Graph> graphList = new LinkedList<>();
    public List<DijikstraTable> dijikstraTList = new LinkedList<>();

    public RMIBulutCizgeASImp() throws RemoteException {
        super();
    }
    @Override
    public String getUserName(String password)  throws RemoteException
    {
        String result = "not found";

        for(User user : userList){
            if(user.getPasword().equals(password)) {
                result = user.getName();
            }
        }

        return  result;
    }

    @Override
    public boolean createUser(String username,
                              String name,
                              String surname,
                              String password,
                              String mailAdress,
                              String cardName,
                              String cardNumber,
                              double cardCredit) throws RemoteException

    {

        boolean addedState;

        CreditCard card = new CreditCard(cardName,cardNumber,cardCredit);
        User currenUser = new User(username, name,surname,mailAdress,password,card);
        BulutMethod methodLogElm = new BulutMethod("Hello User   ",new Date());

        currenUser.addLog(methodLogElm);
        currenUser.payForRequest(20);
        methodLogElm = new BulutMethod("User Creation",new Date());
        methodLogElm.setCost(20);
        currenUser.addLog(methodLogElm);



       if(userList.contains(currenUser)){
           addedState = false;
       }
        else{
            userList.add(currenUser);
            addedState = true;
       }
        return  addedState;
    }

    @Override
    public String getUserProperties(String username,String password) throws RemoteException {
        String result = "notfound";
        BulutMethod methodLogElm = new BulutMethod("User Inquiry",new Date());


        for(User usr : userList){
            if(usr.getUsername().equals(username) && usr.getPasword().equals(password)){
                result =  usr.toString();
                usr.payForRequest(2.5);
                methodLogElm.setCost(2.5);
                usr.addLog(methodLogElm);
            }
        }
        return result;
    }

    @Override
    public String getCreditCardProperties(String username,String usrPasword) throws RemoteException {
        String result = "notfound";
        BulutMethod methodLogElm = new BulutMethod("Credit Innquiry",new Date());
        methodLogElm.setCost(1.25);



        for(User usr : userList){
            if(usr.getPasword().equals(usrPasword) && usr.getUsername().equals(username)){
                usr.payForRequest(1.25);
                result =  usr.getCreditCard().toString();
                usr.addLog(methodLogElm);
            }
        }

        return result;
    }

    @Override
    public String getUserLog(String userPasword) throws RemoteException {
        BulutMethod methodLogElm = new BulutMethod("Log Innquiry",new Date());
        List<BulutMethod> logList = new LinkedList();

        methodLogElm.setCost(1.75);
        for(User usr : userList) {
            if (usr.getPasword().equals(userPasword)){
                usr.payForRequest(1.75);
                usr.addLog(methodLogElm);
                logList = usr.getMethodLog();
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        int i = 1;
        for(BulutMethod method : logList){
            stringBuilder.append( i + " . " +  method);
            ++i;
        }
        return stringBuilder.toString();
    }

    @Override
    public void payCredit(String username, String userPasword, double cost) throws RemoteException {
        BulutMethod methodLogElm = new BulutMethod("Pay Credit : " + cost + "." ,new Date());

        for(User usr : userList) {
            if (usr.getPasword().equals(userPasword) && usr.getUsername().equals(username)){
                usr.payForRequest(cost * 0.005);
                methodLogElm.setCost(cost * 0.005);
                usr.addLog(methodLogElm);
                usr.getCreditCard().setUsedMoney(usr.getCreditCard().getUsedMoney() + cost );
            }
        }
    }

    @Override
    public void createGraph(String username) throws RemoteException {
        BulutMethod methodLogElm = new BulutMethod("Graph Creation",new Date());
        graphList.add( new Graph(username,8));

        //System.out.print("gRAPH CERATED");
        for(User usr : userList){
            if(usr.getUsername().equals(username)){
                usr.payForRequest(5);
                methodLogElm.setCost(5);
                usr.addLog(methodLogElm);
            }
        }
    }

    @Override
    public void addElementToGraph(String username, int first, int secand, int cost) throws RemoteException {
        BulutMethod methodLogElm = new BulutMethod("Graph Adding Elm.",new Date());

        for(Graph graph : graphList){
            if(graph.getUsername().equals(username)){
                graph.insert(new Edge(first,secand,cost));
            }
        }

        for(User usr: userList){
            if(usr.getUsername().equals(username)){
                usr.payForRequest(0.1);
                methodLogElm.setCost(0.1);
                usr.addLog(methodLogElm);
            }
        }
    }

    @Override
    public String getGraphStructure(String username) throws RemoteException {
        String result = "notfound";

        for(Graph graph : graphList){
            if(graph.getUsername().equals(username)){
                result = graph.toString();
            }
        }

        BulutMethod methodLogElm = new BulutMethod("Graph Structure L.",new Date());

        for(User usr : userList){
            if(usr.getUsername().equals(username)){
                usr.payForRequest(4);
                methodLogElm.setCost(4);
                usr.addLog(methodLogElm);
            }
        }
        return result;
    }

    @Override
    public String getDijikstraReport(String username) throws RemoteException {

        StringBuilder strB = new StringBuilder();
        DijkstrasAlgorithm algorithm = new DijkstrasAlgorithm();
        int pred[] = new int[8];
        double dist[] = new double[8];

        Graph curGraph = new Graph();

        //find the graph for user
        for(Graph graph : graphList){
            if(graph.getUsername().equals(username)){
                curGraph = graph;
            }
        }

        algorithm.dijkstrasAlgorithm(curGraph,0,pred,dist);

        strB.append("V" + "\t" + "p[V]" + "\t" + "d[V]" + "\n" );
        strB.append("_" + "\t" + "____" + "\t" + "____" + "\n\n");
        for(int i = 0 ; i< pred.length; ++i) {
            if (dist[i] != 2.147483647E9 && dist[i] != 0) {
                strB.append(i + "\t" + pred[i] + "\t" + dist[i] + "\n");
                dijikstraTList.add(new DijikstraTable(username,i,pred[i],dist[i]));
            }
        }


        BulutMethod methodLogElm = new BulutMethod("Dijikstra Report",new Date());

        for(User usr : userList){
            if(usr.getUsername().equals(username)){
                usr.payForRequest(6.5);
                methodLogElm.setCost(6.5);
                usr.addLog(methodLogElm);
            }
        }
        return strB.toString();
    }

    @Override
    public String getShortestPath(String username,int start , int end) throws RemoteException {
        StringBuilder strB = new StringBuilder();
        List<Integer> resultPath = new LinkedList<>();
        double weightE = -1;
        double weightS = -1;



        BulutMethod methodLogElm = new BulutMethod("Shortest Path R.",new Date());
        methodLogElm.setCost(5);

        for(User usr : userList){
            if(usr.getUsername().equals(username)){
                usr.payForRequest(5);
                //usr.getCreditCard().setUsedMoney(usr.getCreditCard().getUsedMoney() - 10);
                //strB.append("CardCredit : " +String .format("%.2f" ,usr.getCreditCard().getUsedMoney()) + "\t");
                usr.addLog(methodLogElm);

            }
        }


        LinkedList<DijikstraTable> dijikstraList = new LinkedList<>();
        for(DijikstraTable table : dijikstraTList){
            if(table.getUsername().equals(username)){
                dijikstraList.add(table);
            }
        }


        resultPath.add(start);

        for(DijikstraTable tab : dijikstraList){
            if(tab.getV() == end){
                weightE = tab.getD();
                resultPath.add(tab.getP());
            }
            if(tab.getV() == start){
                weightS = tab.getD();
            }
        }

        resultPath.add(end);
        strB.append("Distance : ");
        double result = -1;

        if(start == 0){
            result = weightE;
        }
        else{
            result = weightE - weightS;
        }
        strB.append("( " + start +  " ) from ( " + end + " ) is " + result);

        int prev = -1;
        for(int i = 0 ; i<  resultPath.size(); ++i){

            if(resultPath.get(i) != prev ) {
                strB.append("    " + resultPath.get(i));
                if (i != resultPath.size() - 1) {
                    strB.append("->");
                }
            }
            prev = resultPath.get(i);
        }


        return strB.toString();
    }

}
