class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int actualsum=0;
        if(arr.length<k) return 0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        actualsum=sum;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            actualsum=Math.max(actualsum,sum);
        }
        return actualsum;
    }
    
}