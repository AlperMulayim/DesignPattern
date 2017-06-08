package Models;

/**
 * Created by Alper on 13.12.2016.
 */
public class AmanIflas implements PhoneModel {
    private  String modelName;
    private  PhoneModelProperties amanProp;

    public  AmanIflas()
    {
        this.modelName = "IAman Iflas";
        this.amanProp = new PhoneModelProperties();

        this.amanProp.setDisplaySize(4.5);
        this.amanProp.setBatteryAmper(2000);
        this.amanProp.setBatteryFrekans(16);
        this.amanProp.setCpuSize(4);
        this.amanProp.setCpuFrekans(2.2);
        this.amanProp.setStorageSupportSize(16);
        this.amanProp.setStorageType("MicroSD");
        this.amanProp.setFrontCam(8);
        this.amanProp.setRearCam(5);
        this.amanProp.setCaseMaterial("Plastic");
        this.amanProp.setCaseLenght(143);
        this.amanProp.setCaseWidth(69);
        this.amanProp.setCaseHeight(7.3);
        this.amanProp.setCaseProof("WaterProof");
    }


    @Override
    public String getModelName() {

        return modelName;
    }

    @Override
    public PhoneModelProperties getProperties() {

        return amanProp;
    }
}
