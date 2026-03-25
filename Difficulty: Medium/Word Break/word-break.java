class Solution {
    public boolean wordBreak(String s, String[] dictionary) {
        // code here
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        Set<String> set=new HashSet<>(Arrays.asList(dictionary));
        int maxlength=0;
        for(String str:dictionary) maxlength=Math.max(maxlength,str.length());
        for(int i=1;i<=s.length();i++){
            for(int j=Math.max(0,i-maxlength);j<i;j++){
                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}