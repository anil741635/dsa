class Solution {
    public int[] rearrangeArray(int[] nums) {
        int duplic[]=new int[nums.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<duplic.length;i++){
            if(nums[i]>0) {
                duplic[pos]=nums[i];
                pos+=2;
            }
            else{
                duplic[neg]=nums[i];
                neg+=2;
            }
        }
        return duplic;
    }
}