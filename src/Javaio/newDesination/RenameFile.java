package Javaio.newDesination;

import java.io.File;
import java.io.IOException;

public class RenameFile {
    public static void main(String[] args) throws IOException{
        File afile = new File("/Users/eddyvu/IdeaProjects/JavaRoadMap/src/Javaio/file2.txt");
        if (afile.renameTo(new File("/Users/eddyvu/IdeaProjects/JavaRoadMap/src/Javaio/newDesination"+afile.getName()))
        ){
            System.out.println("file is moved");
        } else {
            System.out.println("failed to move");
        }
    }
}
