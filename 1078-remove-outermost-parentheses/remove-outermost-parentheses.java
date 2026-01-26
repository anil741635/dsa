class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(char i:s.toCharArray()){
            if(i=='('){
                count++;
            }
            else{
                count--;
            }
            if((count==0 && i==')') || (count==1 && i=='(')) continue;
            else{
                sb.append(i);
            }
        }
        return sb.toString();
    }
}