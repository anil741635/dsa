class Solution {
    public static boolean isPowerofTwo(int n) {
        // code herint i=0;
        for(int k=0;k<n;k++){
            if(Math.pow(2,k)==n){
                return true;
            }else if(Math.pow(2,k)<n) continue;
        }
        return false;
    }
}