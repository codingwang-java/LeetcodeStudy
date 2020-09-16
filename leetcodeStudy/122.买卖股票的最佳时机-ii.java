/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int i =0;
        int j=0;
        while(i<prices.length-1){
            if(prices[i]<prices[i+1]){
                j+=prices[i+1]-prices[i];
            }
                i++;
            
        }
        return j;
    }
}
// @lc code=end

