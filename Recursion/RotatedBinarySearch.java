package Recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int target = 8;
        System.out.println(RotatedBinarySearch(arr, target, 0, arr.length- 1));
    }
    static int RotatedBinarySearch(int[] arr, int target, int start, int end){
        int mid = start + (end - start)/2;
        if(start > end)
        {
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] <= arr[mid])
        {
            if(target >= arr[start] && target <= arr[mid]){
                return  RotatedBinarySearch(arr, target, start, mid - 1);
            }
            else {
                return RotatedBinarySearch(arr, target, mid  +1, end);
            }
        }
       if(target >= arr[mid] && target<= arr[end] ){
           return RotatedBinarySearch(arr, target, mid + 1, end);

       }
        return RotatedBinarySearch(arr, target, start, mid - 1);
    }
}
