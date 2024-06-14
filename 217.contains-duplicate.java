/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> done=new HashSet<>();

        for(int num:nums){
            if(done.contains(num)){
                return true;
            }
            done.add(num);
        }
        return false;
    }
}
// @lc code=end

