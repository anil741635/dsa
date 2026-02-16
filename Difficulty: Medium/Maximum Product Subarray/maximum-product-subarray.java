class Solution {
    int maxProduct(int[] arr) {
        // code here
        int maxmul=Integer.MIN_VALUE;
        int prefix=1,sufix=1;
        for(int i=0;i<arr.length;i++){
            if(prefix==0) prefix=1;
            if(sufix==0) sufix=1;
            prefix=prefix*arr[i];
            sufix=sufix*arr[arr.length-i-1];
            maxmul=Math.max(maxmul,Math.max(prefix,sufix));
        }
        return maxmul;
    }
}