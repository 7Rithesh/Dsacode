package Sortings;

public class findInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,2,1};
        int target = 3;
int result = answer(arr, target);
        System.out.println(result);
    }

    static int answer(int[] arr, int target) {
        int peak = findingPeakElement(arr);
        int peakAtAsc = binarySearch(arr, target, 0, peak);
        if (peakAtAsc != -1) {
            return peakAtAsc;
        }
        return binarySearch(arr, target, peak + 1, arr.length - 1);
    }

    static int findingPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // it's in the desc part
                end = mid;
            }
            {
                // desc order
                start = mid + 1;
            }
        }
        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            // create mid for an array
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return  -1;

    }
}