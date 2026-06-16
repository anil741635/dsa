class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp=new int[coins.length+1][amount+1];
        for(int[] i:dp) Arrays.fill(i,-1);
        return helper(amount,coins,0,dp);
    }
    public static int helper(int amount,int[] coins,int index,int[][] dp){
        if(index==coins.length) return 0;
        if(amount==0) return 1;
        if(dp[index][amount]!=-1) return dp[index][amount];
        int skip=helper(amount,coins,index+1,dp);
        int take=0;
        if(amount>=coins[index]){
            take=helper(amount-coins[index],coins,index,dp);
        }
        return dp[index][amount]=skip+take;
    }
}