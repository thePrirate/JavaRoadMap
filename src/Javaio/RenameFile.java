package Javaio;

import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File oldFile = new File("/Users/eddyvu/IdeaProjects/JavaRoadMap/src/Javaio/file1.txt");
        File newfile = new File("/Users/eddyvu/IdeaProjects/JavaRoadMap/src/Javaio/file2.txt");
        if (oldFile.renameTo(newfile)){
            System.out.println("rename successfully");
        }
        else {
            System.out.println("rename failed");
        }
    }
}

