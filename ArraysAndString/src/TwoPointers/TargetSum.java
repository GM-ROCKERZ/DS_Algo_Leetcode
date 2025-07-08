package TwoPointers;

public class TargetSum
{
    public static boolean checkForTarget(int[] nums, int target)
    {
        int left =0;
        int right = nums.length-1;

        while(left < right)
        {
            int curr= nums[left]+nums[right];
            if(curr == target)
            {
                return true;
            }
            if(curr>target)
            {
                right--;
            }else
            {
                left++;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] nums = {1,2,4,6,8,9,14,15};
        int target = 13;

        boolean result = checkForTarget(nums,target);
        System.out.printf("given array contains the target sum: "+result);
    }
}
