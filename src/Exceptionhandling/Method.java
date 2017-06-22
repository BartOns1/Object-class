package Exceptionhandling;

import java.util.Scanner;

/**
 * Created by barto on 22/06/2017.
 */
public class Method {
    int value;


    public Method() {
        this(0);
    }

    public Method(int value) {

        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int method1() throws InvalidTestScore {
        value = method2();
        return value;
    }
    public int method2() throws InvalidTestScore {

        Scanner s = new Scanner(System.in);
        System.out.printf("Geef integer  ");
        String input = s.next();
        value = Integer.parseInt(input);
        if (value<0){
            String message = "Getal ligt onder 0\n";
            throw new InvalidTestScore(message);
        }
        return value;
        }
    }

