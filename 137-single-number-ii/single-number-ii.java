class Solution {
    public int singleNumber(int[] nums) {
        int ones=0,twoes=0;
        for(int i:nums){
            ones=(i^ones) & ~twoes;
            twoes=(i^twoes) & ~ones;
        }
        return ones;
    }
}