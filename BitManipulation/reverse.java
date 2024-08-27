package BitManipulation;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int [] arr = {123,3,4};
        System.out.println(Arrays.toString(ans(arr)));
    }
    static int[] ans(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
