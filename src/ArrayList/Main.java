package ArrayList;

import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        int[] myArray = new int[10];//{1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = i * 10;
//        }
////        for (int i=0; i< myArray.length;i++){
////            System.out.println("Element "+i+" value is "+ myArray[i]);
////
////        }
//        printArray(myArray);
//    }
//
//    public static void printArray(int[] array) {
//        for (int i=0; i< array.length;i++){
//            System.out.println("Element "+i+" value is "+ array[i]);
//
//        }
//    }

//Scanner
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    int[] myIntegers = getIntegers(5);
    for (int i=0;i<myIntegers.length;i++){
        System.out.println("Element "+i+" has value of "+myIntegers[i]);
    }
        System.out.println(getAverage(myIntegers));
    }

    public static Scanner getScanner() {
        return scanner;
    }
    public static int[] getIntegers(int numbers){
        System.out.println("Enter"+numbers+" integer values: ");
        int[] values = new int[numbers];
        for (int i=0; i< values.length;i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i=0;i<array.length;i++){
        sum+=array[i];

        }
        return (double) sum / (double) array.length;
    }
}
