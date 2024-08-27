package Recursion;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {4,2,1,5,6,9};
        System.out.println(Arrays.toString(mergesort(arr)));
    }
    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left  = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

     static int[] merge(int[] first, int[] last) {
        int[] total = new int[first.length + last.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < last.length){
            if(first[i] < last[j]){
                total[k] = first[i];
                i++;
            }
            else {
                total[k] = last[j];
                j++;
            }
            k++;
        }
        while(i < first.length){
            total[k] = first[i];
            i++;k++;
        }
        while (j<last.length){
            total[k] = last[j];
            j++;k++;
        }
        return total;
    }
}
