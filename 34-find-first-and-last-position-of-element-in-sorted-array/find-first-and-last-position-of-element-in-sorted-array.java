class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lb=lowerBound(nums,target);
        int ub=upperBound(nums,target);
         int ans[]={lb,ub};
         return ans;
    }
    public int lowerBound(int nums[],int target){
       int start=0,end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }

     public int upperBound(int nums[],int target){
       int start=0,end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                start=mid+1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}