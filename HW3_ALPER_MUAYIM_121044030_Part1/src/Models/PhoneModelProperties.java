package Models;

/**
 * Created by Alper on 12.12.2016.
 */
public class PhoneModelProperties {

    private double displaySize;
    private int batteryFrekans;
    private int batteryAmper;
    private double cpuFrekans;
    private int cpuSize;
    private String storageType;
    private int storageSupportSize;
    private int rearCam;
    private int frontCam;
    private double caseHeight;
    private String caseProof;
    private double caseWidth;
    private  double caseLenght;
    private String caseMaterial;

    public PhoneModelProperties()
    {

    }
    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public String getCaseProof() {
        return caseProof;
    }

    public void setCaseProof(String caseProof) {
        this.caseProof = caseProof;
    }

    public int getBatteryFrekans() {
        return batteryFrekans;
    }

    public void setBatteryFrekans(int batteryFrekans) {
        this.batteryFrekans = batteryFrekans;
    }

    public int getBatteryAmper() {
        return batteryAmper;
    }

    public void setBatteryAmper(int batteryAmper) {
        this.batteryAmper = batteryAmper;
    }

    public double getCpuFrekans() {
        return cpuFrekans;
    }

    public void setCpuFrekans(double cpuFrekans) {
        this.cpuFrekans = cpuFrekans;
    }

    public int getCpuSize() {
        return cpuSize;
    }

    public void setCpuSize(int cpuSize) {
        this.cpuSize = cpuSize;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public int getStorageSupportSize() {
        return storageSupportSize;
    }

    public void setStorageSupportSize(int storageSupportSize) {
        this.storageSupportSize = storageSupportSize;
    }

    public int getRearCam() {
        return rearCam;
    }

    public void setRearCam(int rearCam) {
        this.rearCam = rearCam;
    }

    public int getFrontCam() {
        return frontCam;
    }

    public void setFrontCam(int frontCam) {
        this.frontCam = frontCam;
    }

    public double getCaseHeight() {
        return caseHeight;
    }

    public void setCaseHeight(double caseHeight) {
        this.caseHeight = caseHeight;
    }

    public double getCaseWidth() {
        return caseWidth;
    }

    public void setCaseWidth(double caseWidth) {
        this.caseWidth = caseWidth;
    }

    public double getCaseLenght() {
        return caseLenght;
    }

    public void setCaseLenght(double caseLenght) {
        this.caseLenght = caseLenght;
    }

    public String getCaseMaterial() {
        return caseMaterial;
    }

    public void setCaseMaterial(String caseMaterial) {
        this.caseMaterial = caseMaterial;
    }
}
