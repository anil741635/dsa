class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegre=new int[V];
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
        }
      HashSet<Integer> visited=new HashSet<>();
      HashSet<Integer> path=new HashSet<>();
      for(int i=0;i<V;i++){
          if(!visited.contains(i)){
              if(dfs(i,adj,visited,path)){
                  return true;
              }
          }
      }
      return false;
    }
    public static boolean dfs(int start,ArrayList<ArrayList<Integer>> adj,Set<Integer> visited,Set<Integer> path){
        visited.add(start);
        path.add(start);
        for(int neighbor:adj.get(start)){
            if(!visited.contains(neighbor)){
                if(dfs(neighbor,adj,visited,path)){
                    return true;
                }
            }
            else if(path.contains(neighbor)) return true;
        }
        path.remove(start);
        return false;
    }
}