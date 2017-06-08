package Phone;

/**
 * Created by Alper on 12.12.2016.
 */
public class Camera {
    private  double front;
    private  double rear;
    private int opticZoom;


    public Camera(double front, double rear, int opticZoom) {
        this.front = front;
        this.rear = rear;
        this.opticZoom = opticZoom;
    }

    public double getFront() {
        return front;
    }

    public void setFront(double front) {
        this.front = front;
    }

    public double getRear() {
        return rear;
    }

    public void setRear(double rear) {
        this.rear = rear;
    }

    public int getOpticZoom() {
        return opticZoom;
    }

    public void setOpticZoom(int opticZoom) {
        this.opticZoom = opticZoom;
    }

    public String toString()
    {
        StringBuilder strb = new StringBuilder();
        strb.append("\tFront : ");
        strb.append(getFront());
        strb.append(" MP\n");
        strb.append("\tRear  : ");
        strb.append(getRear());
        strb.append(" MP \n");
        strb.append("\tZoom  : ");
        strb.append(getOpticZoom());
        strb.append(" xZoom\n");

        return strb.toString();
    }
}
