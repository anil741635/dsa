class Solution {
    public boolean canPartition(int[] nums) {
       int total=0;
       for(int i:nums) total+=i;
       if(total%2!=0) return false;
       Boolean dp[][]=new Boolean[nums.length+1][(total/2)+1];
       return helper(nums,0,dp,total/2); 
    }
    public static boolean helper(int nums[],int ind,Boolean[][] dp,int sum){
        if(sum==0) return true;
        if(ind>=nums.length) return false;
        if(dp[ind][sum]!=null) return dp[ind][sum];
        boolean skip=helper(nums,ind+1,dp,sum);
        boolean take=false;
        if(nums[ind]<=sum){
            take=helper(nums,ind+1,dp,sum-nums[ind]);
        }
        return dp[ind][sum]=take || skip;
    }
}