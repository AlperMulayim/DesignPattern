package Factory;

import Phone.IflasPhone;

/**
 * Created by Alper on 12.12.2016.
 */
public interface PhoneComponentFactory {

    void attachCPUandRAM();
    void attachDsiplay();
    void attachBatery();
    void attachStorage();
    void attachCamera();
    void attachPhoneCase();

    default void doManifactoring(){
        attachCPUandRAM();
        attachDsiplay();
        attachBatery();
        attachStorage();
        attachCamera();
        attachPhoneCase();
    }
    IflasPhone getPhone();
}
