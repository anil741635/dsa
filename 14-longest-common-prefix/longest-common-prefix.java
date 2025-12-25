class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String pref="";
        String start=strs[0];
        String end=strs[strs.length-1];
        for(int i=0;i<start.length();i++)
        {
            if(start.charAt(i)!=end.charAt(i))
            {
                 break;
                
            }
           pref+=(start.charAt(i));
        }
        return pref;
    }
}