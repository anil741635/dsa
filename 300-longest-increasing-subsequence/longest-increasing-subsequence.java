class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[][]=new int[n][n+1];
        for(int[] i:dp)
            Arrays.fill(i,-1);
      return helper(nums,0,-1,dp);
    }
    public static int helper(int[] nums,int index,int prev,int[][] dp){
        if(index==nums.length) return 0;
        if(dp[index][prev+1]!=-1) return dp[index][prev+1];
        int nottake=helper(nums,index+1,prev,dp);
        int take=0;
        if(prev==-1 || nums[index]>nums[prev]){
            take=1+helper(nums,index+1,index,dp);
        }
        return dp[index][prev+1]=Math.max(take,nottake);
    }
}