class Solution {
    public int countDigits(int n) {
        // code here
        int count=0;
        while(n>0){
            int last=n/10;
            count++;
            n=last;
        }
        return count;
    }
}
