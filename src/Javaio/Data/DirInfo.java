package Javaio.Data;

import java.io.File;

public class DirInfo {
    public static void main(String[] args) {
        File file = new File("/Users/eddyvu/IdeaProjects/JavaRoadMap/src/Javaio/Data/file.txt");
        File dirFile = new File("/Users/eddyvu/IdeaProjects/JavaRoadMap/src/Javaio/Data/");
        if (file.exists()){
            System.out.println("Path "+file.getAbsolutePath());
            System.out.println("file name"+file.getName());
            System.out.println("read file "+file.canRead());
            System.out.println("writtable ?"+file.canWrite());
        }else {
            System.out.println("file not found");
        }

        if (dirFile.isDirectory()){
            File[] subsFile = dirFile.listFiles();
            for (File filesub: subsFile){
                System.out.println("name"+filesub.getName()+ " and dir "+filesub.getAbsolutePath());
            }
        }else {
            System.out.println("not a dir");
        }
    }
}
