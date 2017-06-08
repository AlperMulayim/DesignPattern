package AlperMulayimHW2;

import java.util.*;

/**
 * Created by Alper on 25.11.2016.
 */


public class KMeansAlgorithm extends AlgorithmExercise {

    private DistanceAlgorithm distanceAlgorithm;
    private int kmeanVal;
    private List<Cluster> clusterList = new LinkedList<>();
    private List<DataPoint>  dataList = new LinkedList<>();

    public KMeansAlgorithm() {}

    /**
     * initializing the algorithm by data , cluster and distance algorithm
     * @param data
     * @param kCluster
     * @param algorithm
     */
    @Override
    public void initializeAlgorithm(List<DataPoint> data,int kCluster, DistanceAlgorithm algorithm) {
        kmeanVal = kCluster;
        distanceAlgorithm = algorithm;
        dataList = data;
    }

    /**
     * showing cluster output
     */
    @Override
    public void showClusteringOutput() {
        for(Cluster cls : clusterList){
            System.out.println(cls.toString());
        }
    }

    /**
     *  creating random cluster adding the clusters to cluster list
     */
    private  void createRandomCluster(){
        Random rand = new Random();

        for(int i =0 ; i<  kmeanVal ; ++ i){

            int x = rand.nextInt(255);
            int y = rand.nextInt(255);
            int z = rand.nextInt(255);

            DataPoint mydata = new DataPoint(x,y,z);
            //System.out.println( "rand "+ mydata);
            //adding random cluster center to cluster and its data list
            clusterList.add(new Cluster(mydata));
        }
    }

    /**
     * Applying the algorithm
     */
    @Override
    public void applyAlgorithm() {

        createRandomCluster();

        System.out.println(" RANDOM CLUSTERS ");
        for(Cluster cls :clusterList){
            System.out.println(cls.getClusterCentroid());
        }

        for(Cluster cls : clusterList){
            if(cls.canChangeCentroid()){
                assignDataPointsToClusters();
            }
            cls.calculateClusterCenter();
        }



    }


    /**
     * assigning the data points to cluster
     */
    public void assignDataPointsToClusters()
    {
        for(DataPoint dataP : dataList){
            ArrayList<Double> distanceList = new ArrayList<>();
            for(Cluster cluster : clusterList){
                distanceList.add(distanceAlgorithm.doDistanceAlgorithm(dataP,cluster.getClusterCentroid()));
            }

            //System.out.println(distanceList);
            //finding minimum distance
            double min  = Collections.min(distanceList);

            //System.out.println("İtem index " + distanceList.indexOf(min));

            //cluster num
            int clusterNum = distanceList.indexOf(min);
            //adding the point to cluster
            clusterList.get(clusterNum).add(dataP);


        }
    }


}
