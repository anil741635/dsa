class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> list=new ArrayList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        for(int i[]:items2){
            map.put(i[0],i[1]);
        }
        for(int j[]:items1){
           map.put(j[0],map.getOrDefault(j[0],0)+j[1]);
        }
        for(int i:map.keySet()){
            list.add(Arrays.asList(i,map.get(i)));
        }
        return list;
    }
}