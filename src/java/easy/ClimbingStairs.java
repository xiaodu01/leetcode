public class ClimbingStairs {

    /**
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     * 注意：给定 n 是一个正整数。
     * 示例 ：
     * 输入： 3
     * 输出： 3
     * 解释： 有三种方法可以爬到楼顶。
     * 1.  1 阶 + 1 阶 + 1 阶
     * 2.  1 阶 + 2 阶
     * 3.  2 阶 + 1 阶
     */

    public int climbStairs (int n) {
        int[] result = new int[n+2];
        result[0] = 0;
        result[1] = 1;
        result[2] = 2;
        for (int i = 3; i <= n; i++) {
            result[i] = result[i-1] + result[i-2];
        }
        return result[n];

        // 方法二 ：递归
        // HashMap<Integer, Integer> map = new HashMap<>();
        // return getClimbStairs(n, map);
    }


    /**
     * 递归算法
     * @param n
     * @param map map解决重复
     * @return
     */
    public static int getClimbStairs(int n, HashMap<Integer, Integer> map) {
        if (n < 1 ) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (map.containsKey(n))
            return map.get(n);
        else {
            int value = getClimbStairs(n-1, map) + getClimbStairs(n-2, map);
            map.put(n, value);
            return value;
        }
    }
}
