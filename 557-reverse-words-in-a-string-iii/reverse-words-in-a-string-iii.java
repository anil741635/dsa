class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
            {
                int end=i-1;
                StringBuilder str=new StringBuilder();
                while(j<=end){
                   str.append(s.charAt(end));
                    end--;
                }
                sb.append(str.toString());
                sb.append(" ");
                j=i+1;
            }
        }
        int end=s.length()-1;
        StringBuilder str=new StringBuilder();
        while(j<=end){
            str.append(s.charAt(end));
            end--;
        }
        sb.append(str.toString());
        return sb.toString();
    }
}