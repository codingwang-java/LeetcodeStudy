/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        int l = 0; 
        int r= x;
        int m=0;
        while(l<=r){
            int mid = l+(r-l)/2;
            if((long)mid*mid<=x){
                m = mid;
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return m;
    }
}
// @lc code=end

