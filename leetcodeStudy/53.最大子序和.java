/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int cus=nums[0];
        for(int i=1;i<nums.length;i++){
                cus=Math.max(nums[i],cus+=nums[i]);
                max=Math.max(max,cus);
        }
        return max;
    }
}
// @lc code=end

