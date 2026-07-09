class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int maxlen=0;
        for(int i:set){
            if(!set.contains(i-1)){
                int start=i;
                int len=1;
                while(start!=Integer.MAX_VALUE && set.contains(start+1)){
                    start++;
                    len++;
                }
            maxlen=Math.max(maxlen,len);
            }
        }
    return maxlen;
    }
}