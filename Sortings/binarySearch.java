package Sortings;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {23,56,34,67,46};
        int target = 34;
       int result =  binarySearch(arr,target);
        System.out.println(result);
    }

    static int binarySearch(int [] arr, int target){
int start = 0;
int end = arr.length - 1;
while (start <= end)
{
    // create mid for an array
    int mid = start + (end - start) / 2;
    if(target > arr[mid])
    {
        start = mid+1;
    }
    else if (target < arr[mid])
    {
        end = mid - 1;
    }
    else
    {
        return mid;
    }

}
        return -1;
    }
}
