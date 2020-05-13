package Javaio;

import java.io.*;
import java.util.Date;

public class CreateFiles {
    public static void main(String[] args) throws IOException {
        long start = new Date().getTime();
//        create file
        try {
            File file = new File("/Users/eddyvu/IdeaProjects/JavaRoadMap/src/Javaio/newfile.txt");
            if (file.createNewFile()) {
                System.out.println("new file is created");
            } else {
                System.out.println("file is already existing");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end= new Date().getTime();
        System.out.println("time taken "+(start-end));
//        read file with BufferInputStream

        File file1 =  new File("/Users/eddyvu/IdeaProjects/JavaRoadMap/src/Javaio/newfile.txt");
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis  = null;
        try{
            fis = new FileInputStream(file1);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);
            while (dis.available() != 0 ){
                System.out.println(dis.readLine());
            }
        } catch (IOException e){
            e.printStackTrace();

        } finally {
            fis.close();
            bis.close();
            dis.close();
        }

//        Read file with BufferReader
       try(BufferedReader br = new BufferedReader(new FileReader("/Users/eddyvu/IdeaProjects/JavaRoadMap/src/Javaio/newfile.txt"))){
           String s;
           while((s = br.readLine()) != null){
               System.out.println(s);
           }
       }catch (IOException e){
           e.printStackTrace();
       }

    }
}

