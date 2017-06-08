package Models;

/**
 * Created by Alper on 12.12.2016.
 */
public class MaxEffortModel implements PhoneModel {
    private String modelName;
    private PhoneModelProperties maxEffortProperty;

    public MaxEffortModel() {
        this.modelName = "MaximumEffort";
        this.maxEffortProperty = new PhoneModelProperties();

        this.maxEffortProperty.setDisplaySize(5.5);
        this.maxEffortProperty.setBatteryFrekans(27);
        this.maxEffortProperty.setBatteryAmper(3600);
        this.maxEffortProperty.setCpuSize(8);
        this.maxEffortProperty.setCpuFrekans(2.8);
        this.maxEffortProperty.setStorageType("MicroSD");
        this.maxEffortProperty.setStorageSupportSize(64);
        this.maxEffortProperty.setFrontCam(12);
        this.maxEffortProperty.setRearCam(8);
        this.maxEffortProperty.setCaseMaterial("Aluminum");
        this.maxEffortProperty.setCaseLenght(151);
        this.maxEffortProperty.setCaseWidth(73);
        this.maxEffortProperty.setCaseHeight(7.3);
        this.maxEffortProperty.setCaseProof("WaterProof DustProof");

    }

    public String getModelName() {
        return modelName;
    }

    public PhoneModelProperties getProperties() {
        return maxEffortProperty;
    }
}
