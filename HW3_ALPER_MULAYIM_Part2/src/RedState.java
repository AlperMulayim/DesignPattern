/**
 * Created by Alper on 13.12.2016.
 */
public class RedState implements  TrafficState {

    @Override
    public void lamp(TrafficLamp lamp) {
        System.out.println("Red Lamp Light");
        System.out.println("Waiting  15 secands");
        lamp.changeState(new GreenState());
    }
}
