import vpt.Image;
import vpt.algorithms.display.Display2D;

/**
 * Created by  Alper MULAYIM 121044030on 25.10.2016.
 */
public class SmoothAvarageAlgorithm  extends HWAlgorithms {

    public SmoothAvarageAlgorithm(Image theImage) {
        super(theImage);
    }


    //smoothing avarage
    @Override
    public void execAlgorithm() {
        System.out.println("Do Smooth with Avarage");


        int i,j,m,n;
        int [] pixel = new int[25];
        int sum = 0;
        int pcount;
        for(i = 2 ; i<theImg.getXDim()-2; ++i){ //column
            for(j = 2 ; j< theImg.getYDim()-2;++j){ //row
                pcount = 0;
                for(m = i-2; m<=i+2; ++m){
                    for(n = j-2; n<=j+2; ++n){

                        pixel[pcount]=theImg.getXYByte(m, n);
                        ++pcount;
                    }
                }

                for(int a = 0; a < pixel.length; ++a) {
                    sum += pixel[a];
                }

                theImg.setXYByte(i,j,sum/25);
                sum = 0;
            }
        }

        Display2D.invoke(theImg,"AvarageSmooth");
    }


}
