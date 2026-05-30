class Solution {
    public int uniquePaths(int m, int n) {
        long ans=1;
        for(int i=1;i<m;i++) ans=ans*(n-1+i)/i;
      // return  helper(m,n,0,0);
      return (int) ans;
    }
    // public static int helper(int m,int n,int row,int col){
    //     if(row>=m || col>=n) return 0;
    //     if((row==m-1) && (col==n-1)) return 1;
    //     int down=helper(m,n,row+1,col);
    //     int right=helper(m,n,row,col+1);
    //     return down+right;
    // }
}