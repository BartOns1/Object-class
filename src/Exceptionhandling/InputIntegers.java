package Exceptionhandling;
import java.util.Scanner;
/**
 * Created by barto on 22/06/2017.
 */
public class InputIntegers {
    public static void main(String[] args) {

        Integer int1 = 0;
        Integer int2 = 0;
        boolean isnumber = false;
        System.out.printf("input");
        Scanner sc = new Scanner(System.in);
        while (!isnumber) {

            System.out.println("Enter the first integer.");


            try {
                String input = sc.next();
                int1 = Integer.parseInt(input);
                isnumber = true;
            } catch (NumberFormatException ne) {
                System.out.println("Input is not a number, continue");
            }
        }
        System.out.println("input a second integer");
        isnumber = false;
        while (!isnumber) {
            System.out.println("input a second integer");
            try {
                String input = sc.next();
                int2 = Integer.parseInt(input);
                System.out.printf("The produkt is %d \n", int1 * int2);
                break;
            } catch (NumberFormatException ne) {
                System.out.println("Input is not a number, continue");
            }
        }
    }
}