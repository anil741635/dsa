class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int rev=reverse(n);
        return (int) Math.pow(n,rev);
    }
    public static int reverse(int value){
        int r=0;
        while(value>0){
            r=r*10+value%10;
            value/=10;
        }
        return r;
    }
}
