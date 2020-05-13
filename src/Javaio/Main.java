package Javaio;

import java.io.BufferedReader;
//import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter something here: ");
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String s = bufferedReader.readLine();
            System.out.println(s);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
