class Solution {
    public static int maxDepth(String s) {
        // code here
        int count=0;
        int maxdepth=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') count++;
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
