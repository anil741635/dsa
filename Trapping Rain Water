class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n=arr.length;
        int left=0,right=n-1;
        int maxleft=0,maxright=0;
        int water=0;
        while(left<right){
            if(arr[left]<arr[right]){
                maxleft=Math.max(maxleft,arr[left]);
                water+=maxleft-arr[left];
                left++;
            }
            else{
                maxright=Math.max(maxright,arr[right]);
                water+=maxright-arr[right];
                right--;
            }
        }
        return water;
    }
}
