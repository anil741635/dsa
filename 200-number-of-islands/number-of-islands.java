class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    directions(i,j,grid);
                    count++;
                }
            }
        }
        return count;
    }
    public static void directions(int i,int j,char[][] grid){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0') return;
        grid[i][j]='0';
        directions(i+1,j,grid);
        directions(i-1,j,grid);
        directions(i,j+1,grid);
        directions(i,j-1,grid);
    }
}