class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
      if(s1.length()!=s2.length()) return false;
      HashMap<Character,Character> map=new HashMap<>();
      for(int i=0;i<s1.length();i++){
          char original=s1.charAt(i);
          char replace=s2.charAt(i);
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
              if(value!=replace) return false;
          }
        }
        return true;
    }
}