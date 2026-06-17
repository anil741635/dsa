class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total=0;
        for(int i:nums) total+=i;
        if(total<Math.abs(target)) return 0;
        int[][] dp=new int[nums.length+1][2*total+1];
        for(int i[]:dp) Arrays.fill(i,-1);
        return helper(nums,target,0,0,dp,total);
    }
    public static int helper(int nums[],int target,int sum,int index,int[][] dp,int total){
        if(index==nums.length){
            if(target==sum){
                return 1;
            }
            return 0;
        }
        if(dp[index][sum+total]!=-1) return dp[index][sum+total];
        int skip=helper(nums,target,sum-nums[index],index+1,dp,total);
        int notskip=helper(nums,target,sum+nums[index],index+1,dp,total);
        return dp[index][sum+total]=notskip+skip;
    }
}