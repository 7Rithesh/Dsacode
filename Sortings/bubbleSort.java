package Sortings;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the size of the array :");
//        int n = s.nextInt();
//        int [] arr = new int[n];
//        System.out.println("Enter the elements :");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = s.nextInt();
//        }
        int [] arr = {1,4,3,5,2};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                if(arr[j-1] > arr[j])
                {
                   int temp = arr[j-1];
                   arr[j-1] = arr[j];
                   arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
