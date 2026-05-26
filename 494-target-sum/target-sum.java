class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total=0;
        for(int i:nums) total+=i;
        if(total<Math.abs(target)) return 0;
        int s1=(target+total)/2;
        if((target + total) % 2 != 0) return 0;
        int dp[][]=new int[nums.length+1][s1+1];
        dp[0][0]=1;
       for(int i=1;i<=nums.length;i++){
        for(int j=0;j<=s1;j++){
            dp[i][j]=dp[i-1][j];
            if(nums[i-1]<=j) dp[i][j]+=dp[i-1][j-nums[i-1]];
        }
       }
       return dp[nums.length][s1];
    }
}