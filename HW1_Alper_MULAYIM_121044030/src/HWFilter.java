import vpt.Image;
import vpt.algorithms.display.Display2D;
import vpt.algorithms.io.Load;

/**
 * Created by  Alper MULAYIM 121044030on 26.10.2016.
 */
public abstract class HWFilter {
     Image theImage;

    public HWFilter(){
         this.theImage = Load.invoke("lennaGray.png");
    }
    public HWFilter(String imageV)
    {
         this.theImage = Load.invoke(imageV);
    }


     void doFilter(String filterName) {

     }

     void displayTheImage(){
         Display2D.invoke(theImage,"The Image");
     }
}
