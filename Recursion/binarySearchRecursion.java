package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class binarySearchRecursion {
    public static void main(String[] args) {
         int[] arr = {45,23,11,67,88};
         BS(arr, arr.length-1,1 );
        System.out.println(Arrays.toString(arr));
    }
    static void BS(int[] arr,int start, int end){
        if(start == 0){
            return;
        }
       if(start > end){
           if(arr[end - 1] > arr[end]){
               swap(arr, end-1, end);
               BS(arr,start,end + 1);
           }
           else {
               BS(arr,start-1,1);
           }
       }
    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
