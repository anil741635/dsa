class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total=0;
        for(int i:nums) total+=i;
        if(total<Math.abs(target)) return 0;
        int dp[][]=new int[nums.length+1][2*total+1];
        for(int i[]:dp) Arrays.fill(i,-1);
       return helper(nums,target,0,0,dp,total); 
    }
    public static int helper(int nums[],int target,int ind,int sum,int[][] dp,int total){
        if(ind==nums.length){
            if(target==sum){
                return 1;
            }
            else return 0;
        }
        if(dp[ind][total+sum]!=-1) return dp[ind][total+sum];
        int  neg=helper(nums,target,ind+1,sum-nums[ind],dp,total);
        int pos=helper(nums,target,ind+1,sum+nums[ind],dp,total);
        return dp[ind][total+sum]=neg+pos;
    }
}