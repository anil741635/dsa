// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int count=0;
        int temp=n;
        while(n>0){
            int last=n%10;
            if(last!=0)
                if(temp%last==0) count++;
            n/=10;
        }
        return count;
    }
}