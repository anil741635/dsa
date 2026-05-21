class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,0,dp);
    }
    public static int helper(int[] nums,int index,int[] dp){
        if(index>=nums.length) return 0;
        if(dp[index]!=-1) return dp[index];
        int skip=helper(nums,index+1,dp);
        int notskip=nums[index]+helper(nums,index+2,dp);
         return dp[index]=Math.max(skip,notskip);
    }
}