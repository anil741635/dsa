class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldcolor=image[sr][sc];
        if(oldcolor==color) return image;
        dfs(image,oldcolor,sr,sc,color);
        return image;
    }
    public static void dfs(int[][] image,int oldcolor,int sr,int sc,int newcolor){
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length || image[sr][sc]!=oldcolor) return;
        image[sr][sc]=newcolor;
        dfs(image,oldcolor,sr+1,sc,newcolor);
        dfs(image,oldcolor,sr-1,sc,newcolor);
        dfs(image,oldcolor,sr,sc+1,newcolor);
        dfs(image,oldcolor,sr,sc-1,newcolor);
    }
}