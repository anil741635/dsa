class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            min=Math.min(i,min);
            max=Math.max(i,max);
        }
        for(int i=max;i>=1;i--){
            if(min%i==0 && max%i==0) return i;
        }
        return -1;
    }
}