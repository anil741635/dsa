// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp=n;
        int sum=0;
        while(n>0){
            int last=n%10;
            double actualsum=Math.pow(last,3);
            sum+= (int) actualsum;
            n=n/10;
        }
        if(sum==temp) return true;
        else return false;
    }
}