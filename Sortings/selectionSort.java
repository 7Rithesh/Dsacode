package Sortings;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int [] arr = {3,1,2,5,4};
       selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int last = n - i - 1;
            int maxIndex = findMaxIndex(arr, 0, last);
            swap(arr,maxIndex, last);
        }
    }
    static int findMaxIndex(int[] arr, int start, int last)
    {
        int max = start;
        for (int i = start; i <= last ; i++) {
            if(arr[i] > arr[max])
            {
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int start, int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}