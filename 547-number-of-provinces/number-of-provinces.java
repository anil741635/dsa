class Solution {
    public int findCircleNum(int[][] isConnected) {
       int count=0;
       Set<Integer> set=new HashSet<>();
       for(int i=0;i<isConnected.length;i++){
        if(!set.contains(i)){
         dfs(isConnected,i,set);
                count++;
        }
       } 
       return count;
    }
    public static void dfs(int[][] graph,int node,Set<Integer> set){
       set.add(node);
       for(int i=0;i<graph.length;i++){
        if(graph[node][i]==1 && !set.contains(i)){
            dfs(graph,i,set);
        }
       }
    }
}