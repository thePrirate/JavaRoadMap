package Javaio;

import java.io.File;

public class GetCurrentDirectory {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        System.out.println("current directory "+ currentDir);

        File currentDirtory =  new File("");
        System.out.println("pwd "+currentDirtory.getAbsolutePath());
    }
}
