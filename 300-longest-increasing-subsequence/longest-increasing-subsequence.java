class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp=new int[nums.length][nums.length];
        for(int i[]:dp) Arrays.fill(i,-1);
        return helper(nums,0,-1,dp);
    }
    public static int helper(int[] nums,int index,int prev,int[][] dp){
        if(index==nums.length) return 0;
        if(dp[index][prev+1]!=-1) return dp[index][prev+1];
        int skip=helper(nums,index+1,prev,dp);
        int take=0;
        if(prev==-1 || nums[prev]<nums[index])
            take=1+helper(nums,index+1,index,dp);
        return dp[index][prev+1]=Math.max(skip,take);
    }
}