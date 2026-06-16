class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i:nums){
            total+=i;
        }
        if(total%2!=0) return false;
        int sum=total/2;
        Boolean[][] dp=new Boolean[nums.length+1][sum+1];
        return helper(nums,sum,0,dp);
    }
    public static boolean helper(int[] nums,int sum,int index,Boolean[][] dp){
        if(index==nums.length) return false;
        if(sum==0) return true;
        if(dp[index][sum]!=null) return dp[index][sum];
       boolean skip=helper(nums,sum,index+1,dp);
       boolean take=false;
       if(nums[index]<=sum){
            take=helper(nums,sum-nums[index],index+1,dp);
       }
       return dp[index][sum]=skip || take;
    }
}