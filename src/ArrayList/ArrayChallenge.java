package ArrayList;

import java.util.Arrays;
import java.util.Scanner;

//Sorting numbers from highest number to lowest number
public class ArrayChallenge {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    int[] myArray = getIntegers(5);
    int[]sorted = sortArr(myArray);
    printArray(sorted);
    }
    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter "+capacity+" integer values");
    for(int i=0; i<array.length;i++){
        array[i]=scanner.nextInt();
    }
        return array;
    }
    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println("Element "+i+" contents "+arr[i]);
        }
    }
    public static int[] sortArr(int[] arr){
//        int[] sortedArr = new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            sortedArr[i] = arr[i];
//        }
        int[] sortedArr = Arrays.copyOf(arr,arr.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag =false;
            for(int i =0;i<sortedArr.length-1;i++){
                if(sortedArr[i]<sortedArr[i+1]){
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i+1];
                    sortedArr[i+1] = temp;
                    flag = true;
                }
            }
        } return sortedArr;
    }
}
