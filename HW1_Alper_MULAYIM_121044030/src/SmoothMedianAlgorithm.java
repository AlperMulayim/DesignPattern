import vpt.Image;
import vpt.algorithms.display.Display2D;

/**
 * Created by  Alper MULAYIM 121044030 on 26.10.2016.
 */
public class SmoothMedianAlgorithm extends HWAlgorithms {

    public  SmoothMedianAlgorithm(Image imageV){
        super(imageV);
    }

    @Override
    public void execAlgorithm() {
        System.out.println("Do Median Smoot Algorithm");


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
                    for(int b = a + 1 ; b <pixel.length; ++b){
                        if(pixel[b]<pixel[a]){
                            int mypix = pixel[a];
                            pixel[a] = pixel[b];
                            pixel[b] = mypix;
                        }
                    }
                }
                int  med;
                if((pixel.length %2 )== 0){
                    med  = (pixel[pixel.length/2] + pixel[pixel.length/2 - 1])/2;
                }
                else{
                    med = pixel[pixel.length /2];
                }
                theImg.setXYByte(i,j,med);

            }
        }
        Display2D.invoke(theImg,"MedianImage done");
    }
}
