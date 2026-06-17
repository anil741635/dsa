class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,target,0,0);
    }
    public static int helper(int nums[],int target,int sum,int index){
        if(index==nums.length){
            if(target==sum){
                return 1;
            }
            return 0;
        }
        int skip=helper(nums,target,sum-nums[index],index+1);
        int notskip=helper(nums,target,sum+nums[index],index+1);
        return notskip+skip;
    }
}