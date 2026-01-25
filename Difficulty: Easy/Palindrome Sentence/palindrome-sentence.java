class Solution {
    public boolean isPalinSent(String s) {
        // code here
        int left=0,right=s.length()-1;
        while(left<=right){
            char ch=s.charAt(left),ch1=s.charAt(right);
            if(!Character.isLetterOrDigit(ch)) left++;
            else if(!Character.isLetterOrDigit(ch1)) right--;
            else{
                   if(Character.toLowerCase(ch)!=Character.toLowerCase(ch1)){
                       return false;
                   }
                   else{
                       left++;
                       right--;
                   }
            }
        }
        return true;
    }
}