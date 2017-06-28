package be.vdab.bees.Exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by vdabcursist on 20/06/2017.
 */
public class PrintInteger {
    public static void main(String[] args){
        boolean isok =false;
        int integer = 0 ;
        System.out.printf("Geef een getal op : ");
        while (!isok){

        try {
            Scanner s = new Scanner(System.in);
             integer = s.nextInt();
            isok = true;
        } catch(InputMismatchException e) {
            System.out.println("ER IS EEN FOUTE INVOER GEBEURD!!!!");
            System.out.printf("Geef een getal op : ");
        }
        }
        System.out.printf("Het getal is %d\n",integer);
    }
}
