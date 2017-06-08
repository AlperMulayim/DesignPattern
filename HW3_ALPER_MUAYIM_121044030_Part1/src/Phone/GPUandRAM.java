package Phone;

/**
 * Created by Alper on 12.12.2016.
 */
public class GPUandRAM {
    private double frekans;
    private int capacity;
    private int core;

    public GPUandRAM(double frekans, int capacity,int coreNum) {
        this.frekans = frekans;
        this.capacity = capacity;
        this.core = coreNum;
    }

    public double getFrekans() {
        return frekans;
    }

    public void setFrekans(double frekans) {
        this.frekans = frekans;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public String toString()
    {
        StringBuilder strB = new StringBuilder();
        strB.append("\tFrekans  : ");
        strB.append(getFrekans());
        strB.append(" GHz \n");
        strB.append("\tCapacity : ");
        strB.append(getCapacity());
        strB.append(" GB \n");
        strB.append("\tCore     : ");
        strB.append(getCore());
        strB.append(" cores \n");
        return strB.toString();
    }
}
