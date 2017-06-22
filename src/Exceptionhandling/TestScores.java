package Exceptionhandling;

import java.util.Scanner;

/**
 * Created by barto on 22/06/2017.
 */
public class TestScores {

    private int numberOfIndexes = 0;
    private int[] ArrayOfRestrictedIntegers = new int[numberOfIndexes];

    public int getNumberOfIndexes() {
        return numberOfIndexes;
    }

    public void setNumberOfIndexes(int numberOfIndexes) {
        this.numberOfIndexes = numberOfIndexes;
    }

    public TestScores(int[] arrayOfRestrictedIntegers) {
        this.numberOfIndexes = arrayOfRestrictedIntegers.length;
        ArrayOfRestrictedIntegers = arrayOfRestrictedIntegers;
        try{
            for (int i=0; i<numberOfIndexes; i++){

                if(ArrayOfRestrictedIntegers[i]<0 || ArrayOfRestrictedIntegers[i]>100){

                    //throw  new IllegalArgumentException();
                    String message = "The number " + ArrayOfRestrictedIntegers[i] + " is not within the range of [0,100].\n";
                    throw new InvalidTestScore(message);
                }
            }
        } catch (InvalidTestScore e) {
            e.printStackTrace();
        }
    }

    public double average(){
        int som=0;
        for (int i=0;i<numberOfIndexes;i++) {
            som = som + this.ArrayOfRestrictedIntegers[i];
        }
         return ((double)som/numberOfIndexes);
    }
}
