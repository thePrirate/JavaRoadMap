package Javaio;

import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        String txtFile = "/Users/eddyvu/IdeaProjects/JavaRoadMap/src/Javaio/DocFileBuffered.java";
        try(FileReader fr = new FileReader(txtFile);
            BufferedReader br = new BufferedReader(fr);
        ){
            String str;
            while((str=br.readLine())!= null){
                System.out.println(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
