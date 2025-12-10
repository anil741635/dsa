class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> map=new HashMap<>();
        for(String i:strs)
        {
            char[] ca=i.toCharArray();
            Arrays.sort(ca);
            String key=String.valueOf(ca);
            if(!map.containsKey(key))
                map.put(key,new ArrayList());
            map.get(key).add(i);
        }
        return new ArrayList(map.values());
    }
}