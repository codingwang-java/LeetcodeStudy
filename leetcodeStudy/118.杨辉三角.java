/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
            List<Integer> rr=new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    rr.add(1);
                }else{
                    rr.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
                }
            }
            res.add(rr);
        }
        return res;
    }
}
// @lc code=end

