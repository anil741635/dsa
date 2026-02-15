class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int length=0;
        int left=0;
        int zeros=0;
        for(int right=0;right<arr.length;right++){
           if(arr[right]==0) zeros++;
           while(zeros>k){
               if(arr[left]==0){
                   zeros--;
               }
               left++;
           }
           length=Math.max(length,right-left+1);
        }
        return length;
    }
}