import vpt.Image;
import vpt.algorithms.io.Load;

/**
 * Created by  Alper MULAYIM 121044030 on 26.10.2016.
 */
public abstract class HWAlgorithms{

    protected  Image theImg;


    public HWAlgorithms(Image imageV){
        this.theImg = imageV.newInstance(true);
    }
    public void execAlgorithm(){};

}
