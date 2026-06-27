class Solution {
    public int singleNonDuplicate(int[] nums) {
        int slow=0,fast=1;
        if(nums.length==1) return nums[0];
        while(fast<nums.length){
            if(nums[slow]!=nums[fast]) return nums[slow];
            slow+=2;
            fast+=2;
            if(fast>=nums.length) return nums[slow];
        }
        return 0;
    }
}