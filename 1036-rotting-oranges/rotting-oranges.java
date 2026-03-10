class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int row=grid.length;
        int col=grid[0].length;
        int fresh=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2) q.add(new int[] {i,j});
                else if(grid[i][j]==1) fresh++;
            }
        }
        int days=0;
        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty() && fresh>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] curr=q.poll();
                for(int[] d: dir){
                    int r=curr[0]+d[0];
                    int c=curr[1]+d[1];
                    if(r>=0 && c>=0 && r<row && c<col && grid[r][c]==1){
                        fresh--;
                        grid[r][c]=2;
                        q.offer(new int[] {r,c});
                    }
                }
            }
            days++;
        }
        return fresh>0 ? -1:days;
    }
}