package IOpackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by vdabcursist on 26/06/2017.
 */
public class BufRead {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/vdabcursist/Documents/fotos/Alice.txt"))){
            String line;
            while ((line= reader.readLine())!=null){
                System.out.println(line.replaceAll(" ","").toUpperCase());
            }
        }catch( IOException e){
            System.out.println(e.getMessage());
        }
    }
}
