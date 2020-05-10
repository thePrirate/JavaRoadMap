package ArrayList.findMin;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter count ");
    int count = scanner.nextInt();
    int[] returnedArr = readIntegers(count);
    int returnedMin = findMin(returnedArr);
        System.out.println(returnedMin);

//        System.out.println(Arrays.toString(returnedArr));
    }
    private static int[] readIntegers(int count){
        int[] myArr = new int[count];
    for (int i=0;i<myArr.length;i++){
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        scanner.nextLine();
        myArr[i] = number;
    }return  myArr;
    }
    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
