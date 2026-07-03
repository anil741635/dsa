class Solution {
    public int change(int amount, int[] coins) {
        int dp[][]=new int[coins.length+1][amount+1];
        for(int i[]:dp)Arrays.fill(i,-1);
        return helper(amount,coins,0,dp);
    }
    public static int helper(int amount,int[] coins,int ind,int[][] dp){
        if(amount==0) return 1;
        if(ind==coins.length){
            return 0;
        }
        if(dp[ind][amount]!=-1) return dp[ind][amount];
        int skip=helper(amount,coins,ind+1,dp);
        int take=0;
        if(coins[ind]<=amount){
            take=helper(amount-coins[ind],coins,ind,dp);
        }
        return dp[ind][amount]=take+skip;
    }
}