package java.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数，返回其下标
     * 如：给定 nums = [2, 7, 11, 15], target = 9
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     */
    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complements = target - nums[i];
            if(map.containsKey(complements)) {
                return new int[]{map.get(complements),i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    /**
     * 测试用例
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = new TwoSum().twoSum(nums, target);
        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}