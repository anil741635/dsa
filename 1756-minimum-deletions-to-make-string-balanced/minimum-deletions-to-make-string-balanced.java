class Solution {
    public int minimumDeletions(String s) {
         int result=0,b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                b++;
            }
            else if(b>0){
                result++;
                b--;
            }
        }
        return result;
    }
}