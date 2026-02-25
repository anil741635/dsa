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
                if(bfsCheck(i,adj,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean bfsCheck(int start,ArrayList<ArrayList<Integer>> adj,Set<Integer> visited){
        Queue<int[]> queue=new LinkedList<>();
        queue.offer(new int[] {start,-1});
        visited.add(start);
        while(!queue.isEmpty()){
            int[] current=queue.poll();
            int node=current[0];
            int parent=current[1];
            for(int neighbor:adj.get(node)){
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    queue.offer(new int[] {neighbor,node});
                }
                else if(neighbor!=parent){
                    return true;
                }
            }
        }
        return false;
    }
}