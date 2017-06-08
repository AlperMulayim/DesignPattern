import vpt.Image;
import vpt.algorithms.io.Load;

/**
 * Created by  Alper MULAYIM 121044030 on 26.10.2016.
 */
public class EdgeDetectionFilter extends HWFilter {

    HWAlgorithms edgeDetectAlg;


    public EdgeDetectionFilter(String fotoName){
        super(fotoName);
    }
    @Override
    public void doFilter(String filterName) {
        if(filterName.equals("MorphoInt")){
            edgeDetectAlg = new MorphoIntEdgeAlgorithm(this.theImage);
            edgeDetectAlg.execAlgorithm();
        }
        else if(filterName.equals("MorphoExt")){
            edgeDetectAlg = new MorhoExtEdgeAlgorithm(this.theImage);
            edgeDetectAlg.execAlgorithm();
        }
    }
}
