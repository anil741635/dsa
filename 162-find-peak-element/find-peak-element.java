class Solution {
    public int findPeakElement(int[] nums) {
        int maxi=nums[0];
       int  index=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>maxi) {
                maxi=nums[i];
                index=i;
            }
        }
        return index;
    }
}