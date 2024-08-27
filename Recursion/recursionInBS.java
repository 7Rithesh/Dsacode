package Recursion;

public class recursionInBS {
    public static void main(String[] args) {
        int arr[] = {23,33, 44, 45,46,56,77};
        int target = 23;
        System.out.println(BS(arr, target, 0, arr.length-1));
    }
    static int BS(int[] arr, int target, int s, int e)
    {
        if(s > e)
        {
            return -1;
        }
        int m = s + (e -s )/2;
        if(target == arr[m])
        {
            return m;
        }
        if(target > arr[m])
        {
            return BS(arr, target, m + 1, e);
        }
        return BS(arr, target, s, m - 1);
    }
}
