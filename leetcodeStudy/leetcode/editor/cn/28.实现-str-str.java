package leetcode.editor.cn;/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        int n= haystack.length();
        int b= needle.length();
        for(int i =0;i<n-b+1;i++){
            if(haystack.substring(i,i+b).equals(needle)){
                return i;
            }
        }
        return -1;
    }
} 
// @lc code=end

