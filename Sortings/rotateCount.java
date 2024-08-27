package Sortings;

public class rotateCount {
    public static void main(String[] args) {
        int [] arr = {7,9,11,12,5};
        System.out.println(answer(arr)) ;

    }
    static int answer(int[]arr)
    {
        int pivot = rotateCount(arr);
        return pivot + 1;
    }

    static  int rotateCount(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while(start <= end)
        {
            if(mid < end && arr[mid] > arr[mid+ 1])
            {
                return mid;
            }
            if (start < mid && arr[mid - 1] > arr[mid])
            {
                return mid- 1;
            }
            if(arr[start] <= arr[mid] )
            {
                start = mid+ 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return -1;
    }
}
