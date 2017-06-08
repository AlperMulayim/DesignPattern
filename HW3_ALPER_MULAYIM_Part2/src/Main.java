public class Main {

    public static void main(String[] args) {
       /* TrafficLamp myLamp = new TrafficLamp();
        myLamp.lamp();
        myLamp.lamp();
        myLamp.lamp();
        myLamp.lamp();
        myLamp.lamp();
        */

       SubjectTraffic mySub = new SubjectTraffic();

        mySub.setSecand(34);
        new TrafficLamp(mySub);
        mySub.setSecand(60);
        new TrafficLamp(mySub);
        mySub.setSecand(60);

    }
}
