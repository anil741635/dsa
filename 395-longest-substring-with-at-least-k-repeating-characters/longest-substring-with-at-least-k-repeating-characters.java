class Solution {
    public int longestSubstring(String s, int k) {
        int len=0;
       for(int i=0;i<s.length();i++){
        Map<Character,Integer> map=new HashMap<>();
        for(int j=i;j<s.length();j++){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            boolean flag=true;
            for(int freq:map.values()){
                if(freq<k){
                     flag=false;
                     break;
                }
            }
            if(flag)  len=Math.max(len,j-i+1);
        }
       }
       return len;
    }
}