package Phone;

/**
 * Created by Alper on 12.12.2016.
 */
public class Battery {
    private int hertz;
    private int miliAmp;
    private String material;

    public Battery(int hertz, int miliAmp ,String matar){
        this.hertz = hertz;
        this.miliAmp = miliAmp;
        this.material = matar;
    }

    public int getHertz() {
        return hertz;
    }

    public void setHertz(int hertz) {
        this.hertz = hertz;
    }

    public int getMiliAmp() {
        return miliAmp;
    }

    public void setMiliAmp(int miliAmp) {
        this.miliAmp = miliAmp;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String toString(){
        StringBuilder strB = new StringBuilder();

        strB.append("\tType    : ");
        strB.append(getMaterial());
        strB.append("\n");
        strB.append("\tFrekans : ");
        strB.append(getHertz());
        strB.append(" h");
        strB.append("\n");
        strB.append("\tAmper   : ");
        strB.append(getMiliAmp());
        strB.append(" mAh");
        strB.append("\n");
        return strB.toString();
    }
}

