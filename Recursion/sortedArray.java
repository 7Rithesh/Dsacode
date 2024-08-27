package Recursion;

public class sortedArray {
    public static void main(String[] args) {
        int[] arr = {45, 56 ,44,67,73 ,92};
        System.out.println(isSorted(arr, 0));
    }
    static boolean isSorted(int[] arr, int index)
    {
        if (index == arr.length - 1)
        {
            return true;
        }
        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }
}
