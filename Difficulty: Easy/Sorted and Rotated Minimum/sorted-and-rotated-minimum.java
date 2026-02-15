class Solution {
    public int findMin(int[] arr) {
        // code here
        int small=arr[0];
        for(int i=1;i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        return small;
    }
}
