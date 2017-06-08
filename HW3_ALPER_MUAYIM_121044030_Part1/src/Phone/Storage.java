package Phone;

/**
 * Created by Alper on 12.12.2016.
 */
public class Storage {
    private  String type;
    private  int supportCapacity;
    private  int maxCapacity;

    public Storage(String type, int supportCapacity, int maxCap) {
        this.type = type;
        this.supportCapacity = supportCapacity;
        this.maxCapacity = maxCap;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSupportCapacity() {
        return supportCapacity;
    }

    public void setSupportCapacity(int supportCapacity) {
        this.supportCapacity = supportCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }


    public String toString()
    {
        StringBuilder strB = new StringBuilder();
        strB.append("\tType       : ");
        strB.append(getType());
        strB.append("\n");
        strB.append("\tSupportCap : ");
        strB.append(getSupportCapacity());
        strB.append(" GB \n");
        strB.append("\tMax Cap    : ");
        strB.append(getMaxCapacity());
        strB.append(" GB \n");

        return  strB.toString();
    }
}
