class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer, Integer>> list =new ArrayList<>(map.entrySet());

        Collections.sort(list,(a, b) -> b.getValue().compareTo(a.getValue()));
        for(int i=0;i<list.size();i++){
            if(k>0){
                ans.add(list.get(i).getKey());
                k--;
            }
        }
        int[] arr=new int[ans.size()];
        for(int i=0;i<ans.size();i++) arr[i]=ans.get(i);
        return arr;
    }
}