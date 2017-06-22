package Exceptionhandling;

/**
 * Created by barto on 22/06/2017.
 */
public class InvalidTestScore extends Exception {
    static private String message;
    private int WrongNumber=0;

    public InvalidTestScore(String message) {
        super(message);
    }

    public int getWrongNumber() {
        return WrongNumber;
    }

    public void setWrongNumber(int wrongNumber) {
        WrongNumber = wrongNumber;
    }
}
