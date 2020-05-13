package Javaio.Data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        long start = new Date().getTime();
        try(DataOutputStream dOut = new DataOutputStream(new FileOutputStream("data.dat"));) {
            dOut.write(12);
            dOut.writeUTF("Hello world");
//            dOut.close();
        }    catch (IOException e){
            e.printStackTrace();
        }
        long time2 = new Date().getTime();
        System.out.println("time taken to run "+(time2-start));
}}
