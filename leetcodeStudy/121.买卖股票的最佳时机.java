/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int i= Integer.MAX_VALUE;
        int j = 0;
        for(int k=0;k<prices.length;k++){
            if(prices[k]<i){
                i=prices[k];
            }else if(prices[k]-i>j){
                j=prices[k]-i;
            }
        }
        return j;
    }
}
// @lc code=end

