// User function Template for Java

class Solution {
    public static int findMean(int[] arr) {
        // code here
        int sum=0;
        for(int i:arr){
            sum=sum+i;
        }
        return sum/arr.length;
    }
}