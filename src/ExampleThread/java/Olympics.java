
package ExampleThread.java;

/**
 * Created by vdabcursist on 28/06/2017.
 */
public class Olympics {
    public static void main(String[] args) {
        int NUMBER_OF_LANES=8;

        String[] participants = new String[]{"Jommeke", "bobby", "kitty cat", "Lambic", "Polly wilt een koekje", "Road runner", "Popey", "Spider"};


        for (int i=0; i<NUMBER_OF_LANES; i++){
            new Athlete(participants[i]).start();

        }
    }
}
