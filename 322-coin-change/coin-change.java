class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp=new int[coins.length+1][amount+1];
        for(int i[]:dp)Arrays.fill(i,-1);
        int total=helper(coins,amount,0,dp);
        if(total==Integer.MAX_VALUE) return -1;
        return total;
    }
    public static int helper(int coins[],int amount,int index,int[][] dp){
        if(amount==0) return 0;
        if(index==coins.length-1){
            if(amount%coins[index]==0) return amount/coins[index];
            else return Integer.MAX_VALUE;
        }
        if(dp[index][amount]!=-1) return dp[index][amount];
        int skip=helper(coins,amount,index+1,dp);
        int take=Integer.MAX_VALUE;
        if(amount>=coins[index]) {
            take=helper(coins,amount-coins[index],index,dp);
        }
        if(take!=Integer.MAX_VALUE) take=1+take;
        return dp[index][amount]=Math.min(take,skip);
    }
}