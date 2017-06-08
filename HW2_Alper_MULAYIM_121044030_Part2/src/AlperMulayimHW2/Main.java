package AlperMulayimHW2;


import java.util.Scanner;

/**
 * Created by Alper on 25.11.2016.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter filename");
        AlgorithmExercise exercise = new KMeansAlgorithm();
        Scanner inputScanner = new Scanner(System.in);
        String filename = inputScanner.nextLine();
        exercise.doProcessing(filename);

    }

}
