/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<=nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==target-nums[j]){
                    return new int[]{i,j};
                }
            }
        }
    //if it returns no result
        return null;
    }
}
// @lc code=end

