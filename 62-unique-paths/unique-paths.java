class Solution {
    public int uniquePaths(int m, int n) {
        // long ans=1;
        // for(int i=1;i<m;i++) ans=ans*(n-1+i)/i;
        //return (int) ans;
        int dp[][]=new int[m][n];
        for(int[] i:dp) Arrays.fill(i,-1);
       return  helper(m,n,0,0,dp);
    }
    public static int helper(int m,int n,int row,int col,int[][] dp){
        if(row>=m || col>=n) return 0;
        if((row==m-1) && (col==n-1)) return 1;
        if(dp[row][col]!=-1) return dp[row][col];
        int down=helper(m,n,row+1,col,dp);
        int right=helper(m,n,row,col+1,dp);
        return dp[row][col]=down+right;
    }
}