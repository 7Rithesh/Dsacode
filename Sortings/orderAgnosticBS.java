package Sortings;

public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {45,34, 33, 29, 25, 21, 14 ,10};
        int target = 14;
        int index = orderAgnosticBS(arr, target);
        System.out.println(index);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc;
        isAsc = arr[start] < arr[end];
        if (isAsc) {
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
        } else {
            while (start <= end) {
                // create mid for an array
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }

            }
        }

        return -1;
    }

}