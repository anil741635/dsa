class Solution {
    public int maxDepth(String s) {
        //Stack<Character> st=new Stack<>();
        int count=0;
        int maxdepth=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                //st.push(s.charAt(i));
                count++;
            }
            else if(s.charAt(i)==')'){
                maxdepth=Math.max(maxdepth,count);
                count--;
            }
            else{
                continue;
            }
        }
        return maxdepth;
    }
}