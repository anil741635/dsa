class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,1);
        int len=0;
        for(int i=0;i<nums.length;i++){
            for(int prev=0;prev<i;prev++){
                if(nums[prev]<nums[i]){
                    dp[i]=Math.max(dp[i],1+dp[prev]);
                }
            }
            len=Math.max(len,dp[i]);
        }
        return len;
    }
}