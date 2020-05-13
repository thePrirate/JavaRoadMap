package Javaio;

import java.io.PrintWriter;

public class PrintWritterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("hello world");
        pw.flush();

        char[] charArr = {'\n','c','h','a','c','s','m','w','p'};
        pw.println(charArr);
        pw.flush();
    }
}
