/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
   
            public boolean isAnagram(String s, String t) {
                char [] a =s.toCharArray();
                char [] b=t.toCharArray();
                Arrays.sort(a);
                Arrays.sort(b);
                if(a.length!=b.length){
                    return false;
                }
                for(int i=0;i<a.length;i++){
                    if(a[i]!=b[i]){
                        return false;
                    }
                }
                return true;
            }
  
}
// @lc code=end

