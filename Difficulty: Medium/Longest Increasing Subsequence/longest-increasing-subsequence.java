class Solution {
    static int lis(int arr[]) {
        // code here
        int nums[]=new int[arr.length];
        int size=0;
        for(int i=0;i<arr.length;i++){
               int pos= binarySearch(arr[i],nums,size);
               nums[pos]=arr[i];
               if(size==pos) size++;
        }
        return size;
    }
    public static int  binarySearch(int value,int[] nums,int size){
        int left=0;
        int right=size;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]<value){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
    }
}