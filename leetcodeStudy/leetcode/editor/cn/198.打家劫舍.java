package leetcode.editor.cn;/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        if(nums.length==0||nums==null)return 0;
        if(nums.length==1)return nums[0];
        if(nums.length==2)return Math.max(nums[0],nums[1]);
        int first=nums[0];
        int second=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            int temp=second;
            second = Math.max((first+nums[i]),second);
            first =  temp;
        }
        return second;
    }
}
// @lc code=end

