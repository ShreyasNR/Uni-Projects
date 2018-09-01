

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProcessScores {

    //method for lowest score in array
    public static int lowest(int scoreArray[]) {
        int temp = 0;
        //sorting array in accending
        for (int ind1 = 0; ind1 < scoreArray.length - 1; ind1++) {
            for (int ind = 0; ind < scoreArray.length - 1; ind++) {
                if (scoreArray[ind] > scoreArray[ind + 1]) {
                    temp = scoreArray[ind];
                    scoreArray[ind] = scoreArray[ind + 1];
                    scoreArray[ind + 1] = temp;
                }

            }
        }
        return scoreArray[0];    //returns teh lowest from the sorted array
    }
    //method for highest score in array

    public static int highest(int scoreArray[]) {
        int temp = 0;
        //sorting array in decending
        for (int ind1 = 0; ind1 < scoreArray.length - 1; ind1++) {
            for (int ind = 0; ind < scoreArray.length - 1; ind++) {
                if (scoreArray[ind] < scoreArray[ind + 1]) {
                    temp = scoreArray[ind];
                    scoreArray[ind] = scoreArray[ind + 1];
                    scoreArray[ind + 1] = temp;
                }

            }
        }

        return scoreArray[0];    //returns teh highest from the sorted array
    }

    //difference between highest and lowest
    public static int range(int scoreArray[]) {
        int highestScore, lowestScore, range;
        int temp = 0;
        //sorting array in accending
        for (int ind1 = 0; ind1 < scoreArray.length - 1; ind1++) {
            for (int ind = 0; ind < scoreArray.length - 1; ind++) {
                if (scoreArray[ind] > scoreArray[ind + 1]) {
                    temp = scoreArray[ind];
                    scoreArray[ind] = scoreArray[ind + 1];
                    scoreArray[ind + 1] = temp;
                }

            }
        }
        range = scoreArray[scoreArray.length - 1] - scoreArray[0];

        return range;    //returns teh highest from the sorted array
    }
    //method to calculate an dreturn the average of scores

    public static int average(int scoreArray[]) {
        int sumScore = 0;
        int average = 0;
        //sum of all scores

        for (int ind = 0; ind < scoreArray.length; ind++) {
            sumScore += scoreArray[ind];
        }
        //avearge of scores
        average = sumScore / scoreArray.length;
        return average;   //returns the average
    }
    //method to find  median 

    public static int median(int scoreArray[]) {
        int temp = 0;
        int median = 0;
        int arrLen = scoreArray.length;
        //sorting array in accending
        for (int ind1 = 0; ind1 < arrLen - 1; ind1++) {
            for (int ind = 0; ind < arrLen - 1; ind++) {
                if (scoreArray[ind] > scoreArray[ind + 1]) {
                    temp = scoreArray[ind];
                    scoreArray[ind] = scoreArray[ind + 1];
                    scoreArray[ind + 1] = temp;
                }

            }
        }

        
        //if the length of array is even
        if (arrLen % 2 != 0) {
            median = scoreArray[(arrLen / 2)];
        } else {               //odd
            median = (scoreArray[arrLen / 2] + scoreArray[(arrLen - 1) / 2]) / 2;
        }
        return median;    //returns teh highest from the sorted array
    }
    //method to find  mode 

    public static int mode(int scoreArray[]) {
        int mode = 0;
        int maxCounter = 0;
        for (int count = 0; count < scoreArray.length; count++) {
            int counter = 0;
            for (int ind = 0; ind < scoreArray.length; ind++) {
                   //count teh occurence of each score
                if (scoreArray[ind] == scoreArray[count]) {
                    
                    ++counter;
                }

            }
            //if counter is grater than counter
            if (counter > maxCounter) {
                maxCounter = counter;
                mode = scoreArray[count];
            }
        }
        
        return mode;
    }

    public static void main(String[] args) throws IOException {
        String readRow;
        int arrIndex = 0;
        int arrLength = 0;
        //array with the length of number of records

        BufferedReader scoreData = null;
        try {
            scoreData = new BufferedReader(new FileReader(new File("afl.txt")));
            //loop to read file and count number of records inteh file 
            //to initialise teh array
            while ((readRow = scoreData.readLine()) != null) {
                arrLength++;
            }
            int scoreArr[] = new int[arrLength];
            scoreData = new BufferedReader(new FileReader(new File("afl.txt")));

            while ((readRow = scoreData.readLine()) != null) {
                scoreArr[arrIndex] = Integer.parseInt(readRow);
                arrIndex++;

            }

           //display statistics
        System.out.println("Australian Football Association(AFL)");
        System.out.println("\n************Statistics*************");
        System.out.println("Highest Score : "+highest(scoreArr));
        System.out.println("Lowesr Score : "+lowest(scoreArr));
        System.out.println("Score Range : "+range(scoreArr));
        System.out.println("Average Range : "+average(scoreArr));
        System.out.println("Median : "+median(scoreArr));
        System.out.println("Mode : "+mode(scoreArr));
        } catch (Exception ex) {
            Logger.getLogger(ProcessScores.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
            
    }

}
