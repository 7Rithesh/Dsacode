package Recursion;

public class findingTarget {
    public static void main(String[] args) {
        int[] arr = {34,6,61,346,57};
        int target = 61;
        System.out.println(findingTarget(arr, target, 0));
    }
    static int findingTarget(int[] arr, int target, int index)
    {
        if(index == arr.length)
        {
            return -1;
        }
        if(arr[index] == target)
        {
            return index;
        }
        return findingTarget(arr, target, index + 1);

    }
}
