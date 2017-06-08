package AlperMulayimHW2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alper on 28.11.2016.
 */
public class Cluster {
    private List<DataPoint> clusterPointList = new LinkedList<>();
    private DataPoint clusterCentroid;
    private DataPoint oldCentroid;

    public Cluster(DataPoint centerPoint) {
        this.clusterPointList = new LinkedList<>();
        this.clusterCentroid = centerPoint;
        this.oldCentroid = new DataPoint(0,0,0);
    }

    public List<DataPoint> getClusterPointList() {
        return clusterPointList;
    }

    public void add(DataPoint point){
        clusterPointList.add(point);
    }

    public void remove(DataPoint point){
        clusterPointList.remove(point);
    }

    public DataPoint getClusterCentroid() {
        return clusterCentroid;
    }

    public void setClusterCentroid(DataPoint clusterCentroid) {
        this.clusterCentroid = clusterCentroid;
    }

    /**
     * calculates the cluster centroid using avarage of data point axis
     */
    public void calculateClusterCenter()
    {
        int pointCount = clusterPointList.size();
        int sumx = 0;
        int sumy = 0 ;
        int sumz = 0 ;
        int avarageX = 0 ;
        int avarageY = 0;
        int avarageZ = 0;

        Iterator<DataPoint> pointIter = clusterPointList.iterator();

        while(pointIter.hasNext()){
            DataPoint mypoint = pointIter.next();
            sumx += mypoint.getX();
            sumy += mypoint.getY();
            sumz += mypoint.getZ();
        }
        if(pointCount != 0 ) {
            avarageX = sumx / pointCount;
            avarageY = sumy / pointCount;
            avarageZ = sumz / pointCount;
            setClusterCentroid(new DataPoint(avarageX,avarageY,avarageZ));
        }

    }


    public String toString()
    {
        StringBuilder strB = new StringBuilder();
        strB.append("Cluster Centroid : " + getClusterCentroid());

        return  strB.toString();
    }

    /**
     * cluster center can changable controlling.
     * Euclidian diffearance is less than 0.001 can not changable
     * @return canChangable
     */
    public boolean canChangeCentroid(){
        DistanceAlgorithm algorithm = new EuclidianDistanceAlgorithm();
        boolean result = false;
        double diff = algorithm.doDistanceAlgorithm(this.oldCentroid,this.clusterCentroid);

        if(diff < 0.001){
            result = false;
        }
        else{
            result = true;
        }
        return result;
    }
}
