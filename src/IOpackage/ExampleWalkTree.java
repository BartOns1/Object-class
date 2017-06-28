package IOpackage;

import java.io.File;

/**
 * Created by vdabcursist on 26/06/2017.
 */
public class ExampleWalkTree {
    public static void main(String[] args) {
        File startDir = new File("/Users/vdabcursist/documents/");
        print(startDir);
    }

    public static void print(File f){
        if(f.isFile()){
            System.out.println(f.getName());
        } else if (f.isDirectory()){
            System.out.println(f.getName());
            File[] children = f.listFiles();
            if(children != null){
                for (File child: children){
                    print(child);
                }
            }
        }
    }
}
