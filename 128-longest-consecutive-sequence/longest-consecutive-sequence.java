class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length==0) return 0;
        Set<Integer> set=new HashSet<>();
        for(int i:nums) set.add(i);
        int longestcount=0;
        for(int i:set){
            if(!set.contains(i-1)){
                int current=i;
                int count=1;
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                longestcount=Math.max(count, longestcount);
            }
        }
        return  longestcount;
    }
}