class Solution {
    public int mostWordsFound(String[] sentences) {
        int words=0;
        int length=sentences.length;
        String str[]=new String[length];
        for(String i:sentences){
            str=i.split(" ");
            int currentlength=str.length;
            words=Math.max(currentlength,words);
        }
        return words;
    }
}