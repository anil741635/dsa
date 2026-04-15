class Solution {
    public boolean validPalindrome(String s) {
       int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right))
                return palindrome(left+1,right,s) || palindrome(left,right-1,s);
             left++;
        right--;
        }
       
        return true;
    }
    public static boolean palindrome(int left,int right,String str){
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}