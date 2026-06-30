class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0,right=nums.length-1;
        if(nums.length==1 && nums[0]==target) return new int[] {0,0};
        while(left<right){
            if (nums[left]<target) left++;
            if (nums[right]>target) right--;
            if(nums[left]==target && nums[right]==target) return new int[] {left,right};
        }
        return new int[] {-1,-1};
    }
}