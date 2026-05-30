class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=lowerBound(nums,-1,target);
        int end=upperBound(nums,-1,target);
        return new int[] {start,end};
    }
    public static int lowerBound(int[] nums,int index,int target){
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                index=mid;
                right=mid-1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else left=mid+1;
        }
        return index;
    }
    public static int upperBound(int[] nums,int index,int target){
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                index=mid;
                left=mid+1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else left=mid+1;
        }
        return index;
    }
}