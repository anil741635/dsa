class Solution {
    public int arrangeCoins(int n) {
    //     int i=1;
    //     while(n>0){
    //         i++;
    //         n=n-i;
    //     }
    // return i-1;
    int sum=0;
    int remain=1;
        for(int i=1;i<=n;i++){
            remain=i;
                if(n>=i){
                    sum+=i;
                    n=n-i;
                }
        }
        return remain;
    }
}