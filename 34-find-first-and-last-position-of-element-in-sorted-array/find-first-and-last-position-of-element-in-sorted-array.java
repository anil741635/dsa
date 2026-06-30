class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=lowerBound(nums,target);
        int right=upperBound(nums,target);
        return new int[] {left,right};
    }
    public static int lowerBound(int[] nums,int target){
        int left=0,right=nums.length-1;
        int start=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                start=mid;
                right=mid-1;
            }
            else if(nums[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return start;
    }
    public static int upperBound(int[] nums,int target){
        int left=0,right=nums.length-1;
        int end=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                end=mid;
                left=mid+1;
            }
            else if(nums[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return end;
    }
}