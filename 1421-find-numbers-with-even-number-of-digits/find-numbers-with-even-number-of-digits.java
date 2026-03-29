class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int numberOf=digits(nums[i]);
            if(numberOf%2==0) count++;
        }
        return count;
    }
    public static int digits(int value){
        int count=0;
        while(value>0){
            value/=10;
            count++;
        }
        return count;
    }
}