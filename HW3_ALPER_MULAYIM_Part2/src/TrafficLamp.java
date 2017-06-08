/**
 * Created by Alper on 13.12.2016.
 */
public class TrafficLamp  extends  MyObserver{
    TrafficState currentState;
    private int waitTime =40;

    public TrafficLamp(SubjectTraffic subj){
        this.subject = subj;
        this.subject.attach(this);
        waitTime = subj.getSecand();

        this.currentState = new RedState();
    }
    void changeState(TrafficState stat){
        this.currentState = stat;
    }

    void lamp(){
        this.currentState.lamp(this);
    }

    @Override
    public void update() {
        lamp();
        lamp();
        lamp();

    }

    public int getWaitTime(){
        return  waitTime;
    }
}
