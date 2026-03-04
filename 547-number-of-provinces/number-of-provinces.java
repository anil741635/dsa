class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        Set<Integer> visited=new HashSet<>();

        for(int i=0;i<isConnected.length;i++){
            if(!visited.contains(i)) {
                dfs(i,visited,isConnected);
                count++;
            }
        }
        return count;
    }
    public static void dfs(int node,Set<Integer> visited,int[][] isConnected){
        visited.add(node);
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[node][i]==1 && !visited.contains(i))
                dfs(i,visited,isConnected);
        }
    }
}