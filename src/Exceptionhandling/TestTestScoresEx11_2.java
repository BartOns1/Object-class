package Exceptionhandling;

/**
 * Created by barto on 22/06/2017.
 */
public class TestTestScoresEx11_2 {
    public static void main(String[] args){
        int[] arr = new int[]{45,50,40,20,110};
        TestScores IntArrayObject = new TestScores(arr);

        System.out.printf("The average is %f\n", IntArrayObject.average());

    }
}
