// User function Template for Java

class Solution {
    int findMaxSum(int arr[]) {
        // code here
        int  rob=0,norob=0;
        for(int i:arr){
            int newrob=i+norob;
            int newnorob=Math.max(rob,norob);
            rob=newrob;
            norob=newnorob;
        }
        return Math.max(rob,norob);
    }
}