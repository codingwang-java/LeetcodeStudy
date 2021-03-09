package leetcode.editor.cn;/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        if(s==null||s.length()==0)return 0;
        int k=0;
        int i=s.length()-1;
        for(;i>=0;i--){
            if(s.charAt(i)==' '){
                if(k==0)continue;
                break;
                
            }
            k++;
        }
        return k;
        
    }
}
// @lc code=end

