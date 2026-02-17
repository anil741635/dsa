class Solution {
    public int getCount(int n, int d) {
        // code here
        int count=0;
        int high=n,low=d;
        int ans=0;
        while(low<=high){
              int mid=low+(high-low)/2;
              int value=sumOfDigits(mid);
              if((mid-value)>=d) {
                  ans=mid;
                  high=mid-1;
              }
                else{
                    low=mid+1;
                }  
         }
         if(ans==0) return 0;
      return n-ans+1;
    }
    public static int sumOfDigits(int d){
        int sum=0;
        while(d>0){
            sum+=d%10;
            d/=10;
        }
        return sum;
    }
}