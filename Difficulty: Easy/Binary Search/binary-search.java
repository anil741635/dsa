class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int left=0,res=-1;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==k){
                res=mid;
                right=mid-1;
            }
            else if(arr[mid]<k){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return res;
    }
}