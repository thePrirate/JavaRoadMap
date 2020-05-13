package Javaio;

import java.io.*;

public class CopyFile {
//    private static final String FILENAME = "/Users/eddyvu/IdeaProjects/JavaRoadMap/src/Javaio/newfile1.txt";
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream =  null;
        try{
            inputStream = new FileInputStream("/Users/eddyvu/IdeaProjects/JavaRoadMap/src/Javaio/newfile1.txt");
            outputStream = new FileOutputStream("/Users/eddyvu/IdeaProjects/JavaRoadMap/src/Javaio/newfile.txt");
            int i =0;
            while ( (i=inputStream.read() )!=-1){
                outputStream.write(i);
                System.out.println("Success");
            }
        } finally {
            if (inputStream != null){
                inputStream.close();
            } if (outputStream != null){
                outputStream.close();
            }
        }
    }
//    public static void createFile()
}
