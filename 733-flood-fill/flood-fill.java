class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldcolor=image[sr][sc];
        if(color==oldcolor) return image;
        dfs(image,sr,sc,oldcolor,color);
        return image;
    }
    public static void dfs(int[][] image,int i,int j,int oldcolor,int newcolor){
        if(i<0 || i>=image.length || j<0 || j>=image[0].length || image[i][j]!=oldcolor){
            return;
        }
        image[i][j]=newcolor;
        dfs(image,i+1,j,oldcolor,newcolor);
        dfs(image,i-1,j,oldcolor,newcolor);
        dfs(image,i,j+1,oldcolor,newcolor);
        dfs(image,i,j-1,oldcolor,newcolor);
    }
}