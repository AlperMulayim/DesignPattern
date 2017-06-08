package Sales;

/**
 * Created by Alper on 12.12.2016.
 */
public class SalesPacket  {
    private int displayBit;
    private  String battteryType;
    private  int cpuCore;
    private  int maxStorage;
    private  int optiZoom;
    private  int maxProof;


    public SalesPacket(){}
    public int getDisplayBit() {
        return displayBit;
    }

    public void setDisplayBit(int displayBit) {
        this.displayBit = displayBit;
    }

    public String getBattteryType() {
        return battteryType;
    }

    public void setBattteryType(String battteryType) {
        this.battteryType = battteryType;
    }

    public int getCpuCore() {
        return cpuCore;
    }

    public void setCpuCore(int cpuCore) {
        this.cpuCore = cpuCore;
    }

    public int getMaxStorage() {
        return maxStorage;
    }

    public void setMaxStorage(int maxStorage) {
        this.maxStorage = maxStorage;
    }

    public int getOptiZoom() {
        return optiZoom;
    }

    public void setOptiZoom(int optiZoom) {
        this.optiZoom = optiZoom;
    }

    public int getMaxProof() {
        return maxProof;
    }

    public void setMaxProof(int maxProof) {
        this.maxProof = maxProof;
    }
}
