package Sortings;

import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int [] arr = {3,2,1,5,4};
        System.out.println(Arrays.toString(cycleSort(arr)));
    }
    static int[] cycleSort(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int crtIndex = i+1;
            if(arr[i] != crtIndex)
            {
                swap(arr, i, arr[i] - 1);
            }
            else {
                i ++;
            }
        }
        return arr;
    }
    static void swap(int[] arr, int start, int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
