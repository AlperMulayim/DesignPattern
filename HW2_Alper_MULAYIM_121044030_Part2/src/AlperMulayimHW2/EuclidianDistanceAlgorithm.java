package AlperMulayimHW2;

/**
 * Created by Alper on 25.11.2016.
 */
public class EuclidianDistanceAlgorithm  extends   DistanceAlgorithm{
    /**
     * euclian distance between two point
     * @param a
     * @param b
     * @return
     */
    @Override
    public double doDistanceAlgorithm(DataPoint a , DataPoint b) {
        //System.out.println("Euclidian doDistance");
        return Math.sqrt( Math.pow((a.getX() - b.getX()),2 )  + Math.pow(a.getY() - b.getY() , 2) + Math.pow((a.getZ() - b.getZ()),2 ));
    }
}
