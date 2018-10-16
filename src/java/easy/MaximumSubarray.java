package java.easy;

public class MaximumSubarray {

    /**
     * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     * 示例:
     * 输入: [-2,1,-3,4,-1,2,1,-5,4],
     * 输出: 6
     * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
     */

     /**
      * 动态规划 O(n)
      * @param nums
      * @return
      */
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int s = nums[0];
        for (int i = 1; i < nums.length; i++) {
            s = s > 0 ? s + nums[i] : nums[i];
            result = Math.max(result, s);
        }
        return result;
    }
}