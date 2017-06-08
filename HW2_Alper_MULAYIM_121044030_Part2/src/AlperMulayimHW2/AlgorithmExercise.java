package AlperMulayimHW2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Alper on 25.11.2016.
 */

public abstract class AlgorithmExercise  {

    private List<DataPoint> dataList = new LinkedList<>();


    public  void  initializeAlgorithm(){
        initializeAlgorithm(dataList,5,new EuclidianDistanceAlgorithm());
    }

    public abstract  void initializeAlgorithm(List<DataPoint>data,int kCluster, DistanceAlgorithm algorithm);

    public void doProcessing(String filename)
    {
        loadFile(filename);
        initializeAlgorithm();
        applyAlgorithm();
        System.out.println("________________________________");
        showClusteringOutput();
    }
    /**
     * load the file to AlperMulayimHW2.DataPoint list
     */
    public void loadFile(String filename)
    {
        Scanner inputStream = null;
        int x,y,z;


        try{
            inputStream = new Scanner(new FileInputStream(filename));
        }
        catch (FileNotFoundException e){
            System.err.println("File not found");
            System.exit(0);
        }


        while (inputStream.hasNextLine()){
            String inpuStr = inputStream.nextLine();
            //System.out.println(inpuStr);
            List<String> lineParse = new ArrayList<>();

            String clearStr =  inpuStr.replaceAll("\\s","");
            //System.out.println(clearStr);

            for(String str : clearStr.split(",") ){
                lineParse.add(str);
            }


            x = Integer.parseInt(lineParse.get(0));
            y = Integer.parseInt(lineParse.get(1));
            z = Integer.parseInt(lineParse.get(2));

            DataPoint linDataPoint = new DataPoint(x,y,z);
            dataList.add(linDataPoint);

        }
        inputStream.close();


    }

    /**
     * showing dataList
     */
    private  void showDataList()
    {
        for(DataPoint data : dataList){
            System.out.println(data.getX() + " " + data.getY()+ " " + data.getZ());
        }

    }

    public abstract void showClusteringOutput();
    public abstract  void applyAlgorithm();
}
