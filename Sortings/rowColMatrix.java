package Sortings;

import java.util.Arrays;

public class rowColMatrix {
    public static void main(String[] args) {
        int arr[][] =
                {
                        {10, 20, 30 ,40},
                        {15, 25, 35 ,45},
                        {28, 29, 37, 40},
                        {33, 34, 38, 50}
                };
        System.out.println(Arrays.toString(matrix2D(arr,45)));
    }
    static int[] matrix2D(int [][] arr, int target)
    {
        int row = 0;
        int col = arr.length-1;
        while (row < arr.length && col >= 0)
        {
            if(arr[row][col] == target)
            {
                return new int[] {row, col};
            }
            if(arr[row][col] > target)
            {
                col--;
            }
            else
            {
                row++;
            }

        }
        return new int[] {-1,-1};
    }
}
