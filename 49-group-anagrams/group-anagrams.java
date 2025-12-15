class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs)
        {
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String sortedstr=String.valueOf(ch);
            map.putIfAbsent(sortedstr, new ArrayList<>());
            map.get(sortedstr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}