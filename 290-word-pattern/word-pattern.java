class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        HashMap<String,Character> map1=new HashMap<>();
       String str[]=s.split(" ");
       if(str.length!=pattern.length()) return false;
       for(int i=0;i<pattern.length();i++){
        if(!map.containsKey(pattern.charAt(i))){
            map.put(pattern.charAt(i),str[i]);
        }
        else{
           if(!map.get(pattern.charAt(i)).equals(str[i])) return false;
        }

        if(!map1.containsKey(str[i])){
            map1.put(str[i],pattern.charAt(i));
        }
        else{
           if(!map1.get(str[i]).equals(pattern.charAt(i))) return false;
        }
       }
       return true;
    }
}