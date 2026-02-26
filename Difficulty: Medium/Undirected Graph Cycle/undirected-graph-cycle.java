class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        Set<Integer> visited=new HashSet<>();
        for(int i=0;i<V;i++){
            if(!visited.contains(i)){
                if(dfs(i,-1,visited,adj)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(int node,int parent,Set<Integer> visited,ArrayList<ArrayList<Integer>> adj){
        visited.add(node);
        for(int neighbor:adj.get(node)){
            if(!visited.contains(neighbor)){
                if(dfs(neighbor,node,visited,adj)) return true;
            }
            else if(neighbor!=parent){
                return true;
            }
        }
        return false;
    }
}