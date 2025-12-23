class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int maxlen=0;
        for(right=0;right<fruits.length;right++){
            int currcount=map.getOrDefault(fruits[right],0);
            map.put(fruits[right],currcount+1);
            while(map.size()>2){
                int count=map.get(fruits[left]);
                if(count==1){
                    map.remove(fruits[left]);
                }
                else{
                    map.put(fruits[left],count-1);
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}