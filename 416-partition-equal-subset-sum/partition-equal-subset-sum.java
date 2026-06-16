class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i:nums){
            total+=i;
        }
        if(total%2!=0) return false;
        int sum=total/2;
        boolean[][] dp=new boolean[nums.length+1][sum+1];
        for(int i=0;i<=nums.length;i++) dp[i][0]=true;
         for(int j=0;j<=sum;j++) dp[0][j]=false;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=sum;j++){
            if(nums[i-1]<=j){
                dp[i][j]=dp[i-1][j] || dp[i-1][j-nums[i-1]];
            }
            else dp[i][j]=dp[i-1][j];
        }
       }
       return dp[n][sum];
    }
}