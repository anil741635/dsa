class Solution {
    public int maxProduct(String[] words) {
      int maxlen=0;
     for(int i=0;i<words.length;i++){
        for(int j=i+1;j<words.length;j++){
                if(contains(words[i],words[j])){
                    int len=words[i].length()*words[j].length();
                    maxlen=Math.max(maxlen,len);
                }
        }
      }  
      return maxlen;
    }
    public static boolean contains(String s1,String s2){
       int[] freq=new int[26];
       for(int i:s1.toCharArray()){
        freq[i-'a']++;
       }
       for(int i:s2.toCharArray()){
        if(freq[i-'a']!=0) return false;
       }
       return true;
    }
}