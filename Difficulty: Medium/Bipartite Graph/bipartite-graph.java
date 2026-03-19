class Solution {
    public boolean isBipartite(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        int[] color=new int[V];
        Arrays.fill(color,-1);
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                color[i]=0;
                q.add(i);
                while(!q.isEmpty()){
                    int node=q.poll();
                    for(int neighbor:adj.get(node)){
                        if(color[neighbor]==-1){
                            color[neighbor]=1-color[node];
                            q.add(neighbor);
                        }
                        else{
                            if(color[neighbor]==color[node]) return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}