class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total=0;
        for(int i:nums) total+=i;
        if(total<Math.abs(target)) return 0;
        int dp[][]=new int[nums.length+1][2*total+1];
        for(int i[]:dp) Arrays.fill(i,-1);
        return helper(nums,target,0,0,dp,total);
    }
    public static int helper(int[] nums,int target,int index,int sum,int dp[][],int s1){
        if(index==nums.length) {
            if(sum==target) return 1;
            return 0;
        }
        if(dp[index][sum+s1]!=-1) return dp[index][sum+s1];
        int pick=helper(nums,target,index+1,sum+nums[index],dp,s1);
        int notpick=helper(nums,target,index+1,sum-nums[index],dp,s1);
        return dp[index][sum+s1]=pick+notpick;
    }
}