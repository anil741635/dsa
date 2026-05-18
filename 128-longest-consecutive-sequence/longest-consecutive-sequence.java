class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
         int count=0;
       Set<Integer> set=new HashSet<>();
       for(int i:nums){
        set.add(i);
       }
       for(int i:set){
            if(!set.contains(i-1)){
                int curr=i;
                int len=1;
                while(set.contains(curr+1)){
                    curr++;
                    len++;
                }
                count=Math.max(count,len);
            }
       }
       return count;
    }
}