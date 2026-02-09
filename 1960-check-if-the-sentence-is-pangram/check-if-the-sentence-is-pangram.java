class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] s=new int[26];
        for(int i=0;i<sentence.length();i++){
            s[sentence.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(s[i]==0) return false;
        }
        return true;
    }
}