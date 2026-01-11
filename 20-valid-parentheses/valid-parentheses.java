class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char i:s.toCharArray()){
            if((i=='(' ) || (i=='[') || (i=='{')){
                st.push(i);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char ch=st.pop();
                if( i==')' && ch!='('){
                    return false;
                 }
                if(i=='}' && ch!='{'){
                    return false;
                 }
                 if(i==']' && ch!='['){
                    return false;
                 }
            }
        }
        return st.isEmpty();
    }
}