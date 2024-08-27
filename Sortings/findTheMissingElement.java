package Sortings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findTheMissingElement {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
        static List<Integer> findDisappearedNumbers(int[] nums) {

            int i = 0;
            while(i < nums.length)
            {
                int crtIndex = nums[i] - 1;
                if(nums[i] != nums[crtIndex])
                {
                    swap(nums, i, crtIndex);
                }
                else {
                    i ++;
                }
            }

            List<Integer> list = new ArrayList<>();
            for(int j =0 ; j < nums.length; j++)
            {
                int crtIndex = j +1;
                if(nums[j] != crtIndex)
                {
                    list.add(crtIndex);
                }
            }
            return list;
        }


        static void swap(int[] nums, int start, int end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
    }
