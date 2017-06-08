/**
 * Created by  Alper MULAYIM 121044030 on 26.10.2016.
 */
public class SmoothFilter extends   HWFilter{

    HWAlgorithms smoothAlg;

    public  SmoothFilter(String fotoNameV){
        super(fotoNameV);
    }
    @Override
    public void doFilter(String filterName) {
        if(filterName.equals("AvarageFilter")){
            smoothAlg = new SmoothAvarageAlgorithm(this.theImage);
            smoothAlg.execAlgorithm();
        }
        else if(filterName.equals("MedianFilter")){
            smoothAlg = new SmoothMedianAlgorithm(this.theImage);
            smoothAlg.execAlgorithm();
        }
    }
}
