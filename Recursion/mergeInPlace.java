package Recursion;

import java.util.Arrays;

public class mergeInPlace  {
    public static void main(String[] args) {
        int[] arr = {45,10,2,9,6,11};
        mergeInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeInPlace(int[] arr, int start, int end){
        if(end - start == 1){
            return;
        }
        int mid = (start + end) / 2;
        mergeInPlace(arr,start, mid);
        mergeInPlace(arr,mid,end);

        merge(arr,start,mid,end);
    }
    static void merge(int[] arr, int start,int mid, int end){
        int[] mix = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;
        while (i < mid && j < end){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid){
            mix[k] = arr[i];
            i++;k++;
        }
        while (j < end) {
            mix[k] = arr[j];
            j++;k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }

    }
}