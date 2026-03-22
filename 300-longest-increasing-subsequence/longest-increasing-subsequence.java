class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] arr=new int[nums.length];
        int size=0;
        for(int i=0;i<nums.length;i++){
            int pos=binarySearch(nums[i],arr,size);
            arr[pos]=nums[i];
            if(size==pos) size++;
        }
        return size;
    }
    public static int binarySearch(int value,int[] arr,int size){
        int left=0,right=size;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]<value){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
    }
}