class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int[] counter=new int[26];
       for(char i:magazine.toCharArray()){
            counter[i-'a']++;
       }
       for (char c : ransomNote.toCharArray()){
            if (counter[c-'a'] == 0) return false;
                    counter[c-'a']--;
        }
        return true;
    }
}