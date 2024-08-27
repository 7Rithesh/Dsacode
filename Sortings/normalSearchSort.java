package Sortings;

import java.util.Arrays;

public class normalSearchSort {
    public static void main(String[] args) {
        int [] arr = {5,3,2,1,4};
        System.out.println(Arrays.toString(simpleSort(arr)));
    }
    static int[] simpleSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-2; i++) {
            for (int j = 1 + i; j < n - i; j++) {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = arr[i];
                }
            }

        }

        return arr;
    }

}
