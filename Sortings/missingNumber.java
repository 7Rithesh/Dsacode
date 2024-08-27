package Sortings;

public class missingNumber {
    public static void main(String[] args) {
        int [] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
    static int missingNumber(int[] nums) {
        int i =0;
        while(i < nums.length)
        {
            if(nums[i] < nums.length && nums[i] != i)
            {
                swap(nums,i,nums[i]);
            }
            else
            {
                i++;
            }
        }
        int ans = findIndexNumber(nums);
        return ans;
    }
    static int findIndexNumber(int [] nums)
    {

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i)
            {
                return i;
            }
        }
        return nums.length;
    }
    static void swap(int[] nums, int start, int end)
    {
        int temp =nums[start];
       nums[start] =nums[end];
       nums[end] = temp;
    }
}
