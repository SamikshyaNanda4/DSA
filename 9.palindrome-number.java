/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        int rev=0 ; 
        int check=x;
        while (x>0){
         int d = x%10;
         rev=(rev*10)+d;
         x= x/10;
    
        }
        if(rev==check)
        return true;
        else
        return false;
        }        
    }

// @lc code=end

