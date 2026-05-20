class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length(),m=text2.length();
        int dp[][]=new int[n][m];
        for(int[] i:dp) Arrays.fill(i,-1);
        return helper(text1,0,text2,0,dp);
    }  
    public static int helper(String s1,int index1,String s2,int index2,int[][] dp){
        if(index1==s1.length() || index2==s2.length()) return 0;
        if(dp[index1][index2]!=-1) return dp[index1][index2];
        if(s1.charAt(index1)==s2.charAt(index2)){
            return dp[index1][index2]=1+helper(s1,index1+1,s2,index2+1,dp);
        }
        int skip1=helper(s1,index1+1,s2,index2,dp);
        int skip2=helper(s1,index1,s2,index2+1,dp);
        return dp[index1][index2]=Math.max(skip1,skip2);
    }
}