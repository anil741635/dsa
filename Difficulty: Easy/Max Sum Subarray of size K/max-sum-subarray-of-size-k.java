class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
      int sum=0;
      for(int i=0;i<k;i++){
          sum+=arr[i];
      }
      int actualsum=sum;
      for(int i=k;i<arr.length;i++){
          actualsum+=arr[i];
          actualsum-=arr[i-k];
          sum=Math.max(sum,actualsum);
      }
      return sum;
    }
    
}