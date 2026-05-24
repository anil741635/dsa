class Solution {
    public boolean canPartition(int[] nums) {
        int total=0;
        for(int i:nums) total+=i;
        if(total%2!=0) return false;
        Boolean dp[][]=new Boolean[nums.length+1][(total/2)+1];
       return helper(nums,0,total/2,dp);
    }
    public static boolean helper(int nums[],int index,int sum,Boolean[][] dp){
        if(sum==0) return true;
        if(index==nums.length) return false;
        if(dp[index][sum]!=null) return dp[index][sum];
        boolean pick=false;
        boolean notpick=false;
        if(nums[index]<=sum) {
            pick=helper(nums,index+1,sum-nums[index],dp);
        }
         notpick=helper(nums,index+1,sum,dp);
        return dp[index][sum]=pick || notpick;
    }
}