class Solution {
    public int rob(int[] nums) {
        int n=nums.length; 
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int[] dp1=new int[n];
        int[] dp2=new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int firstone=helper(nums,0,n-2,dp1); 
        int secondone=helper(nums,1,n-1,dp2);
        return Math.max(firstone,secondone);
    }
    public static int helper(int[] nums,int start,int end,int[] dp){
        if(start>end) return 0;
        if(dp[start]!=-1) return dp[start];
        int skip=helper(nums,start+1,end,dp);
        int notskip= nums[start]+helper(nums,start+2,end,dp);
        return dp[start]=Math.max(skip,notskip);
    }
}