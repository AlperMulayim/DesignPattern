import vpt.Image;
import vpt.algorithms.display.Display2D;
import vpt.algorithms.io.Load;

import javax.net.ssl.SSLContext;
import java.util.Scanner;

/**
 *  Alper MULAYIM 121044030
 */

public class Main {



    public static void main(String[] args) {

        while(true) {
            testTheProgram();
        }
    }


    public  static void  testLibrary(){
        System.out.println("Hello World!");

        Image img = Load.invoke("lennaGray.png");

        Display2D.invoke(img,"HELLOOOO");

        int p = img.getXYByte(20,30);
        System.out.println(p);

        img.setXYByte(20,30,0);
        Display2D.invoke(img,"HELLOOOO");
    }

    public static void menuWelcome(){
        System.out.println("___Selecting Filter__");
        System.out.println("1.\tSmoothing Filter ");
        System.out.println("2.\tEdge Detection Filter");
        System.out.println("3.\t Apply All Filters and Algorithms");
        System.out.println("4.\tEXIT");
        System.out.print("Plesase choose your filter >> ");
    }
    public static void menuEdgeDetection(){
        System.out.println("__ Edge Detection Filter __ ");
        System.out.println("1.\tMorphoExt Edge Detection Algorithm");
        System.out.println("2.\t MorphoInt Edge Detection Algorithm");
        System.out.print("Plesase choose your algorithm >> ");
    }
    public static void menuUpload(){
        System.out.println( "\nIMAGE FILTER PROGRAM");
        System.out.println("_______________________");
        System.out.println("Please Upload your Image ");
        System.out.println("exit : enter (quit)");
        System.out.println("Exp : lennaGray.png , einstein.jpg >> ");
    }
    public static void menuSmoothing(){
        System.out.println("__ Smoothing Filter __");
        System.out.println("1. \t Avarage Smoothing Algorithm");
        System.out.println("2.\t Median Smoothing Algorithm");
        System.out.print("Plesase choose your algorithm >> ");
    }

    public static void testTheProgram()
    {
        Scanner keyboard = new Scanner(System.in);

        HWFilter hwFilter;

        menuUpload();
        String fotoname = keyboard.nextLine();
        if(fotoname.equals("quit")){
            System.exit(1);
        }
        menuWelcome();
        int inputVal = keyboard.nextInt();


            Image img = Load.invoke(fotoname);


        if(inputVal == 1){

            menuSmoothing();

            inputVal = keyboard.nextInt();

            if(inputVal == 1){
                Display2D.invoke(img,"Original Image");
                hwFilter = new SmoothFilter(fotoname);
                hwFilter.doFilter("AvarageFilter");
            }
            else if(inputVal == 2){
                Display2D.invoke(img,"Original Image");
                hwFilter = new SmoothFilter(fotoname);
                hwFilter.doFilter("MedianFilter");
            }
            else{
                System.err.println("ERR :: Algorithm val <1 -2 >  ");
                System.out.println("Please Try Again");
            }

        }
        else if (inputVal == 2){

            menuEdgeDetection();
            inputVal = keyboard.nextInt();

            if(inputVal == 1){
                Display2D.invoke(img,"Original Image");
                hwFilter = new EdgeDetectionFilter(fotoname);
                hwFilter.doFilter("MorphoExt");
            }
            else if(inputVal == 2){
                Display2D.invoke(img,"Original Image");
                hwFilter = new EdgeDetectionFilter(fotoname);
                hwFilter.doFilter("MorphoInt");
            }
            else{
                System.err.println("ERR :: Algorithm val <1 -2 >  ");
                System.out.println("Please Try Again");
            }
        }
        else if(inputVal == 3){
            Display2D.invoke(img,"Original Image");
            hwFilter = new SmoothFilter(fotoname);
            hwFilter.doFilter("AvarageFilter");
            hwFilter.doFilter("MedianFilter");
            hwFilter = new EdgeDetectionFilter(fotoname);
            hwFilter.doFilter("MorphoExt");
            hwFilter.doFilter("MorphoInt");
        }
        else if(inputVal == 4){
            System.exit(1);
        }
        else{
            System.err.println("ERR :: Filter val <1 - 2 >  ");
            System.out.println("Please Try Again");
        }

    }
}
