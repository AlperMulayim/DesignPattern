import javax.lang.model.element.Name;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class RMIServer {

    public static void main(String[] args) throws RemoteException {

        try {
            StringBuilder strB = new StringBuilder();

            RMIBulutCizgeAS service = new RMIBulutCizgeASImp();
            Naming.rebind("RMIBulutCizgeAS",service);
            String str = "   _   _   _   _   _   _   _   _   _   _   _   _  \n" +
                    "  / \\ / \\ / \\ / \\ / \\ / \\ / \\ / \\ / \\ / \\ / \\ / \\ \n" +
                    " ( B | u | l | u | t | C | i | z | g | e | A | S )\n" +
                    "  \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ ";
            strB.append(str);
            strB.append("\n_________________________________________________\n");
            strB.append("BulutCizgeAS Server Running");
            System.out.print(strB.toString());
        }
        catch (MalformedURLException e){
            System.err.println("ERR:: Service Main " + e.toString());
        }

    }
}

