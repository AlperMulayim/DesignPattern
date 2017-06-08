package Models;

/**
 * Created by Alper on 13.12.2016.
 */
public class IflasDeluxe implements PhoneModel {
  private  String modelName;
    private PhoneModelProperties iflasDeluxeProp;



    public IflasDeluxe(){
        this.modelName = "Iflas Deluxe";
        this.iflasDeluxeProp = new PhoneModelProperties();

        this.iflasDeluxeProp.setDisplaySize(5.3);
        this.iflasDeluxeProp.setBatteryAmper(2800);
        this.iflasDeluxeProp.setBatteryFrekans(20);
        this.iflasDeluxeProp.setCpuSize(6);
        this.iflasDeluxeProp.setCpuFrekans(2.2);
        this.iflasDeluxeProp.setStorageType("MicroSD");
        this.iflasDeluxeProp.setStorageSupportSize(23);
        this.iflasDeluxeProp.setFrontCam(12);
        this.iflasDeluxeProp.setRearCam(5);
        this.iflasDeluxeProp.setCaseMaterial("Aluminum");
        this.iflasDeluxeProp.setCaseLenght(149);
        this.iflasDeluxeProp.setCaseWidth(73);
        this.iflasDeluxeProp.setCaseHeight(7.7);
        this.iflasDeluxeProp.setCaseProof("WaterProof");
    }
    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public PhoneModelProperties getProperties() {
        return iflasDeluxeProp;
    }
}
