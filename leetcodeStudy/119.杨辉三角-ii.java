/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 */

// @lc code=start

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>(rowIndex + 1);
        int numRows = rowIndex + 1;
        for (int index = 0; index < numRows; index++){
            if (index == 0){
                res.add(1);
            }else {
                long eachValOfRow = (long) res.get(index - 1) * (long) (numRows - index) / index;
                res.add((int) eachValOfRow);
            }
        }
        return res;
    }
    
}
// @lc code=end

