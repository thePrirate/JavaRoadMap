package Javaio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class AppendNewFIle {
    private static final String FILENAME = "/Users/eddyvu/IdeaProjects/JavaRoadMap/src/Javaio/newfile2.txt";

    public static void main(String[] args) {
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            String data = "this is new content";
            File file = new File(FILENAME);
//            check if the file exist?
            if (!file.exists()) {
                file.createNewFile();
            } else {
                fw = new FileWriter(file.getAbsoluteFile(), true);
                bw = new BufferedWriter(fw);
                bw.write(data);
                System.out.println("Success");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        Delete File
//        File file = new File(FILENAME);
//        if (file.delete()){
//            System.out.println(file.getName()+" has been deleted");
//        } else {
//            System.out.println("Delete operation is failed");
//        }
    }
}
