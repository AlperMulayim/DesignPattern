
package Phone;

/**
 * Created by Alper on 12.12.2016.
 */
public class IflasPhone {
    private String market;
    private String modelName;
    private Battery phBatery;
    private Camera phCam;
    private Display phDisp;
    private GPUandRAM phCPU;
    private Storage phStorage;
    private Case phCase;

    public IflasPhone() {
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setPhBatery(Battery phBatery) {
        this.phBatery = phBatery;
    }

    public void setPhCam(Camera phCam) {
        this.phCam = phCam;
    }

    public void setPhDisp(Display phDisp) {
        this.phDisp = phDisp;
    }

    public void setPhCase(Case phCase) {
        this.phCase = phCase;
    }

    public void setPhCPU(GPUandRAM phCPU) {

        this.phCPU = phCPU;
    }

    public void setPhStorage(Storage phStorage) {
        this.phStorage = phStorage;
    }

    public String toString(){
        StringBuilder strB = new StringBuilder();
        strB.append("\nPHONE PROPERTIES\n");
        strB.append("Market  : ");
        strB.append(market);
        strB.append("\n");
        strB.append("Model   : ");
        strB.append(modelName);
        strB.append("\n");


        strB.append("CPU and RAM : \n");
        strB.append(phCPU.toString());
        strB.append("Storage : \n");
        strB.append(phStorage.toString());
        strB.append("Display  : \n");
        strB.append(phDisp.toString());
        strB.append("Battery :\n");
        strB.append(phBatery.toString());
        strB.append("Camera : \n");
        strB.append(phCam.toString());
        strB.append("Case : \n");
        strB.append(phCase.toString());

        return  strB.toString();
    }


}
