class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][]=new int[coins.length+1][amount+1];
        for(int i[]:dp) Arrays.fill(i,-1);
        int ans=helper(coins,amount,0,dp);
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
    public static int helper(int[] coins,int amount,int ind,int[][] dp){
        if(ind==coins.length-1) {
            if(amount%coins[ind]==0) return amount/coins[ind];
            else return Integer.MAX_VALUE;
        }
        if(dp[ind][amount]!=-1) return dp[ind][amount];
        int skip=helper(coins,amount,ind+1,dp);
        int take=Integer.MAX_VALUE;
        if(coins[ind]<=amount){
            take=helper(coins,amount-coins[ind],ind,dp);
        }
        if(take!=Integer.MAX_VALUE) take=1+take;
        return dp[ind][amount]=Math.min(skip,take);
    }
}