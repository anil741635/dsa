class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()][text2.length()];
        for(int i[]:dp) Arrays.fill(i,-1);
        return helper(text1,text2,0,0,dp);
    }
    public static int helper(String s1,String s2,int index1,int index2,int[][] dp){
        if(s1.length()==index1 || s2.length()==index2) return 0;
        if(s1.charAt(index1)==s2.charAt(index2)) {
            return dp[index1][index2]=1+helper(s1,s2,index1+1,index2+1,dp);
        }
        if(dp[index1][index2]!=-1) return dp[index1][index2];
         int skip1=helper(s1,s2,index1+1,index2,dp);
        int skip2=helper(s1,s2,index1,index2+1,dp);
        return dp[index1][index2]=Math.max(skip1,skip2);
    }
}