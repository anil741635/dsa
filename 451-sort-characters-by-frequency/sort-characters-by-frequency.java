class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        StringBuilder sb=new StringBuilder();
        ArrayList<Character> list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)-> map.get(b)-map.get(a));
        for(char i:list){
            int count=map.get(i);
            for(int j=0;j<count;j++){
                sb.append(i);
            }
        }
        return sb.toString();
    }
}