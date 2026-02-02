class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char original=s.charAt(i);
            char replace=t.charAt(i);
            if(!map.containsKey(original)){
                if(!map.containsValue(replace)){
                    map.put(original,replace);
                }
                else{
                    return false;
                }
            }
            else{
                char value=map.get(original);
                    if(value!=replace)
                        return false;
            }
        }
        return true;
    }
}