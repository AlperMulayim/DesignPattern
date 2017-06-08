package Phone;

/**
 * Created by Alper on 12.12.2016.
 */
public class Case {
    double length;
    double width;
    double height;
    String guard;
    String material;
    double maxGuard;

    public Case(double length, double width, double height, String guard, String material,int guardMax) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.guard = guard;
        this.material = material;
        this.maxGuard = guardMax;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getGuard() {
        return guard;
    }

    public void setGuard(String guard) {
        this.guard = guard;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getMaxGuard() {
        return maxGuard;
    }

    public void setMaxGuard(double maxGuard) {
        this.maxGuard = maxGuard;
    }

    public String toString(){
        StringBuilder strB = new StringBuilder();
        strB.append("\tSize      : ");
        strB.append(getLength());
        strB.append(" x ");
        strB.append(getWidth());
        strB.append(" x ");
        strB.append(getHeight());
        strB.append(" mm\n");
        strB.append("\tMaterial  : ");
        strB.append(getMaterial());
        strB.append("\n");
        strB.append("\tGuard     : ");
        strB.append(getGuard());
        strB.append("\n");
        strB.append("\tMax Guard : ");
        strB.append(getMaxGuard());
        strB.append("cm");

        return  strB.toString();
    }
}
