class Solution {
    public int majorityElement(int[] nums) {
        int majority=0,voting=0;
        for(int i=0;i<nums.length;i++){
            if(majority==0){
                majority=nums[i];
                voting++;
            }
            if(majority==nums[i]){
                voting++;
            }
            else{
                voting--;
            }
            if(voting==0){
                majority=nums[i];
                voting++;
            }
        }
        return majority;
    }
}