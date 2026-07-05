class Solution {
    public int findTargetSumWays(int[] nums, int target) {
       return helper(nums,target,0); 
    }
    public static int helper(int nums[],int target,int ind){
        if(ind==nums.length){
            if(target==0){
                return 1;
            }
            else return 0;
        }
             int   neg=helper(nums,target-nums[ind],ind+1);
        int pos=helper(nums,target+nums[ind],ind+1);
        return neg+pos;
    }
}