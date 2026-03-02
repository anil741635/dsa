class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        Map<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
       for(int i=1;i<=arr.length;i++){
           if(map.containsKey(i)) list.add(map.get(i));
           else list.add(0);
       }
       return list;
    }
}
