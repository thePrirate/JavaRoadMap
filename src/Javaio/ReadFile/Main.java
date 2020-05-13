package Javaio.ReadFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static final String SOURCE_FILE = "";
    public static final String DESTINATION_FILE = "";

    public static void main(String[] args) throws IOException {
        try {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        fis = new FileInputStream(SOURCE_FILE);
        fos = new FileOutputStream(DESTINATION_FILE);
        int i;
        while ((i=fis.read())!=-1){
            fos.write(i);
        }
        System.out.println("Success");

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
