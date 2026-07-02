class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()][text2.length()];
        for(int i[]:dp)Arrays.fill(i,-1);
        return helper(text1,text2,0,0,dp);
    }
    public static int helper(String s1,String s2,int ind1,int ind2,int[][] dp){
        if(ind1>=s1.length() || ind2>=s2.length()) return 0;
        if(dp[ind1][ind2]!=-1) return dp[ind1][ind2];
        int take=0;
        if(s1.charAt(ind1)==s2.charAt(ind2)){
            take=1+helper(s1,s2,ind1+1,ind2+1,dp);
        }
        int skip1=helper(s1,s2,ind1+1,ind2,dp);
        int skip2=helper(s1,s2,ind1,ind2+1,dp);
        return dp[ind1][ind2]=Math.max(take,Math.max(skip1,skip2));
    }
}