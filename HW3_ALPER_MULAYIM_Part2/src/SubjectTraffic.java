import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alper on 14.12.2016.
 */
public class SubjectTraffic {
    private List<MyObserver> observers = new ArrayList();
    private int secand;

    public void setSecand(int secandV){
        this.secand = secandV;
        notifyAllObservers();
    }

    public void attach(MyObserver myObserver){
        observers.add(myObserver);
    }

    public void notifyAllObservers()
    {
        for(MyObserver observ : observers){
            observ.update();
        }
    }
    int getSecand(){
        return  secand;
    }
}