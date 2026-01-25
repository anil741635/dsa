class Solution {
    public static boolean checkPangram(String s) {
        // code here
       HashSet<Character> set=new HashSet<>();
       s=s.toLowerCase();
       for(char i:s.toCharArray()){
           if(i>='a' && i<='z'){
               set.add(i);
           }
       }
       return set.size()==26;
    }
}