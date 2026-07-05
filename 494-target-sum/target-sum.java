class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total=0;
        for(int i:nums) total+=i;
        if(total<Math.abs(target)) return 0;
        int dp[][]=new int[nums.length+1][2*total+1];
        for(int i[]:dp) Arrays.fill(i,-1);
       return helper(nums,target,0,dp,total); 
    }
    public static int helper(int nums[],int target,int ind,int[][] dp,int total){
        if(target>total || -target>total) return 0;
        if(ind==nums.length){
            if(target==0){
                return 1;
            }
            else return 0;
        }
        if(dp[ind][target+total]!=-1) return dp[ind][target+total];
        int  neg=helper(nums,target-nums[ind],ind+1,dp,total);
        int pos=helper(nums,target+nums[ind],ind+1,dp,total);
        return dp[ind][target+total]=neg+pos;
    }
}