package Javaio.newDesination;

import java.io.*;

public class MoveFile {
//copy current file, delete current file, create newfile in new directory
    public static void main(String[] args) throws IOException {

    File newFile = new File("/Users/eddyvu/IdeaProjects/JavaRoadMap/src/Javaio/newfile.txt");
    if(newFile.renameTo(new File("/Users/eddyvu/IdeaProjects/JavaRoadMap/src/Javaio/newDesination/text2.txt"))){
        newFile.delete();
        System.out.println("file moved");
    } else {
        System.out.println("fail to moved");
    }
    }
}
