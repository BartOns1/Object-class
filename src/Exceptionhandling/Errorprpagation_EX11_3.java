package Exceptionhandling;

/**
 * Created by barto on 22/06/2017.
 */
public class Errorprpagation_EX11_3 {
    public static void main(String[] args) {

        try {
            Method M = new Method();
            int r = M.method1();
        } catch (InvalidTestScore e) {
                e.printStackTrace();
        }
    }
}
