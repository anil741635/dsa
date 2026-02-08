class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int maxdepth=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                maxdepth=Math.max(maxdepth,st.size());
                st.pop();
            }
            else{
                continue;
            }
        }
        return maxdepth;
    }
}