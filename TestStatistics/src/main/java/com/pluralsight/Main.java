package com.pluralsight;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        int[] testScores = testScores();

        int totalScore = 0;

        int highestScore  = 0;

        int lowestScore = 0;

        double medianScore = 0;

        for (int i = 0; i < testScores.length; i++){
            int scores = testScores[i];
            totalScore += scores;
            if (scores > highestScore){
                highestScore = scores;
            } else{
                lowestScore = scores;
            }
        }

        Arrays.sort(testScores);
        for(int name : testScores){
            //System.out.println(name);
        }
        medianScore = totalScore / testScores.length;



        System.out.println(highestScore);
        System.out.println(lowestScore);
        System.out.printf("%.2f\n", medianScore);

    }

    public static int[] testScores(){


        int[] testScores = {75, 80, 99, 54, 65, 70, 100, 50, 90, 40};
        return testScores;
    }
}


