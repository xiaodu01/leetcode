package java.easy;

public class PathSum {

    /**
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
     * 注意你不能在买入股票前卖出股票。
     * 示例 1:
     * 输入: [7,1,5,3,6,4]
     * 输出: 5
     * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
     */




     /**
      * 最小的买入，最大的卖
      * @param prices
      * @return
      */
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int low = prices[0];
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            result = Math.max(prices[i]-low, result);
            low = Math.min(low, prices[i]);
        }
        return result;
    }
}