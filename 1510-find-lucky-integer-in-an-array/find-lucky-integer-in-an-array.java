class Solution {
    public int findLucky(int[] arr) {
        int lucky=-1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            if(i==map.get(i)) {
                lucky=Math.max(i,lucky);
            }
        }
        return lucky;
    }
}