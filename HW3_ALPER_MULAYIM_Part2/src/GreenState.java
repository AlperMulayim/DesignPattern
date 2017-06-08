/**
 * Created by Alper on 13.12.2016.
 */
public class GreenState implements TrafficState {
    @Override
    public void lamp(TrafficLamp lamp) {
        System.out.println("Green Lamp Light");
        System.out.println("Waiting "+ lamp.getWaitTime()+ " secands");
        lamp.changeState(new YellowState());
    }
}
