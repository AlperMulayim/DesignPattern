import vpt.Image;
import vpt.algorithms.display.Display2D;

/**
 * Created by  Alper MULAYIM 121044030 on 26.10.2016.
 */
public class MorphoIntEdgeAlgorithm extends HWAlgorithms {

    public MorphoIntEdgeAlgorithm(Image imageV) {
        super(imageV);
    }


    @Override
    public void execAlgorithm() {
        System.out.println("MorphoInt Edge Detection Algorithm");
        int i,j,m,n;
        int [] pixel = new int[25];

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
                    for (int b = a +1 ; b<pixel.length; ++b){
                        if(pixel[b]>pixel[a]){
                            int temp = pixel[b];
                            pixel[b] = pixel[a];
                            pixel[a] = temp;
                        }
                    }
                }

                int val = theImg.getXYByte(i,j);
                theImg.setXYByte(i,j,pixel[0] - val);

            }


        }
        Display2D.invoke(theImg,"MorphoIntEdge Algorithm");

        }
}
