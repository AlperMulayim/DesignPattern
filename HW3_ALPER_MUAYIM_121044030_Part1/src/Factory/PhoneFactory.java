package Factory;

import Models.PhoneModel;
import Models.PhoneModelProperties;
import Phone.*;
import Sales.Market;
import Sales.SalesPacket;

/**
 * Created by Alper on 13.12.2016.
 */
public abstract class PhoneFactory implements  PhoneComponentFactory{
    protected IflasPhone iflasPhone;
    protected PhoneModel model;
    protected Market market;
    protected PhoneModelProperties modelProperties;
    protected  SalesPacket salesPacket;



    @Override
    public void attachCPUandRAM() {
        System.out.println("-------------------------------");
        System.out.println("Market : " + market.getName());
        System.out.println("Model  : " + model.getModelName());
        System.out.println("1 - Attaching CPU and RAM");
        GPUandRAM myCPU = new GPUandRAM(modelProperties.getCpuFrekans(),modelProperties.getCpuSize(),salesPacket.getCpuCore());
        iflasPhone.setPhCPU(myCPU);
        System.out.println(myCPU);
    }

    @Override
    public void attachDsiplay() {
        System.out.println("2 - Attaching Display");
        Display myDisplay = new Display(modelProperties.getDisplaySize(),salesPacket.getDisplayBit());
        iflasPhone.setPhDisp(myDisplay);

        System.out.println(myDisplay);
    }

    @Override
    public void attachBatery() {
        System.out.println("3 - Attaching Battery");
        Battery myBat = new Battery(modelProperties.getBatteryFrekans(),modelProperties.getBatteryAmper(),salesPacket.getBattteryType());
        iflasPhone.setPhBatery(myBat);
        System.out.println(myBat);
    }

    @Override
    public void attachStorage() {
        System.out.println("4 - Attaching Storage");
        Storage myStore = new Storage(modelProperties.getStorageType(),modelProperties.getStorageSupportSize(),salesPacket.getMaxStorage());
        iflasPhone.setPhStorage(myStore);
        System.out.println(myStore);
    }

    @Override
    public void attachCamera() {
        System.out.println("5 - Attaching Camera");
        Camera myCamera = new Camera(modelProperties.getFrontCam(),modelProperties.getRearCam(),salesPacket.getOptiZoom());
        iflasPhone.setPhCam(myCamera);
        System.out.println(myCamera);
    }

    @Override
    public void attachPhoneCase() {
        System.out.println("6 - Attaching Case");
        Case myCase = new Case(modelProperties.getCaseLenght(),modelProperties.getCaseWidth(),modelProperties.getCaseHeight(),
                modelProperties.getCaseProof(),modelProperties.getCaseMaterial(),salesPacket.getMaxProof());

        iflasPhone.setPhCase(myCase);
        System.out.println(myCase);

    }

    @Override
    public IflasPhone getPhone() {
        return iflasPhone;
    }
}
