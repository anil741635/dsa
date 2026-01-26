class Solution {
    public String reverseWords(String s) {
        // Code here
       while(s.startsWith(".")){
           s=s.substring(1);
       }
       while(s.endsWith(".")){
           s=s.substring(0,s.length()-1);
       }
        String s1[]=s.split("\\.+");
        StringBuilder sb=new StringBuilder();
        for(int i=s1.length-1;i>=0;i--){
            sb.append(s1[i]);
            if(i!=0) sb.append(".");
        }
        return sb.toString();
    }
}