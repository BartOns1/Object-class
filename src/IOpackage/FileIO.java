package IOpackage;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by vdabcursist on 26/06/2017.
 */
public class FileIO{
    public static void main(String[] args) {
    /*    File fd = new File("/Users/vdabcursist/documents/test.pdf");


        try {
            boolean crfile = fd.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        long l = fd.length();
        System.out.println(l);
        if(fd.exists()){
            System.out.println("Hij bestaat");
        } else {
            System.out.println("nikske");
        }

        //TreeSet <String> directoryTree = new TreeSet<>();
        File newfile = new File("/Users/vdabcursist/documents/test2.pdf");

        //fd.renameTo(newfile);

        if(newfile.exists()){
            System.out.println("Hij bestaat");
        } else {
            System.out.println("nikske");
        }

        if(fd.exists()){
            System.out.println("oude file bestaat nog");
        } else {
            System.out.println("oude file bestaat niet meer");
        }

        System.out.println("the owner of this file is" + newfile.getParent());*/

        Path newFile = new File("/Users/vdabcursist/documents/test2.pdf").toPath();

        try {
            System.out.println(Files.getOwner(newFile));
        } catch (IOException e){
            System.out.println("pech");
        }

        Path destination = new  File("/Users/vdabcursist/downloads/backup").toPath();

       try {
           if(!Files.exists(destination)){
           Files.createDirectory(destination);
           }

        } catch (IOException e) {
            e.printStackTrace();
        }
        Path source = new  File("/Users/vdabcursist/documents/").toPath();


       List<Path> filelist = new LinkedList<>();
        try {
            Files.walkFileTree(source, new SimpleFileVisitor<Path>() {//hier wordt ter plaats de methode overschreven voor 1-malig gebruik
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    filelist.add(file.getName(-1));
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(filelist);


/*        try {
            for (Path f : filelist) {
                Path sourceFile = new File(source.toString().concat(f.toString())).toPath();
                Path destinationFile = new File(destination.toString().concat(f.toString())).toPath();
                Files.copy(sourceFile, destinationFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/




    }
}
