

/**
 * Created by Alper on 13.12.2016.
 */
public class YellowState implements  TrafficState {


    @Override
    public void lamp(TrafficLamp lamp) {
        System.out.println("Yellow Lamp Light");
        System.out.println("Waiting  3 secands");
        lamp.changeState(new RedState());
    }
}
