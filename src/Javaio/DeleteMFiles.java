package Javaio;

import java.io.File;
import java.io.FilenameFilter;

public class DeleteMFiles {
    public static void main(String[] args) {
        File folder = new File("/Users/eddyvu/IdeaProjects/JavaRoadMap/src/Javaio");
        for (File file : folder.listFiles()) {
            if (file.getName().endsWith(".txt")) {
                file.delete();
            }
        }
    }
}
