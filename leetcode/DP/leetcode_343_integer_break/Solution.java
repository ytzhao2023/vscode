package DP.leetcode_343_integer_break;

class Solution {
    public int integerBreak(int n) {

        int[] dp = new int[n+1];
        dp[2] = 1;
        
        for (int i = 3; i < n+1; i++){
            for (int j = 1; j < i/2 + 1; j++){

                dp[i] = Math.max(dp[i], Math.max(dp[i-j] * j , j * (i-j)));
                
            }
        }
        return dp[n];
        
    }
}