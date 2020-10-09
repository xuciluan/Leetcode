package math;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 输入: [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class q5_最大子序和 {
    //2020-10-10一刷：做不出来，看了下答案
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int num = nums[0];

        for (int i = 1; i < nums.length; i++) {
            num = Math.max(nums[i] + num, nums[i]);
            max = Math.max(max, num);
        }
        return max;
    }
}
