package Phone;

/**
 * Created by Alper on 12.12.2016.
 */
public class Display {
    private double inch;
    private int bit;

    public Display(double inch, int bit) {
        this.inch = inch;
        this.bit = bit;
    }

    public double getInch() {
        return inch;
    }

    public void setInch(double inch) {
        this.inch = inch;
    }

    public int getBit() {
        return bit;
    }

    public void setBit(int bit) {
        this.bit = bit;
    }

    public String toString()
    {
        StringBuilder strB = new StringBuilder();
        strB.append("\tSize : ");
        strB.append(getInch());
        strB.append(" inches \n");
        strB.append("\tBit  : ");
        strB.append(getBit());
        strB.append(" bit\n");
        return strB.toString();
    }

}
