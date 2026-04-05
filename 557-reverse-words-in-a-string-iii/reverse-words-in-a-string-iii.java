class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String[] str=s.split(" ");
        for(String word:str){
            StringBuilder rev=new StringBuilder(word);
            sb.append(rev.reverse().toString());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}