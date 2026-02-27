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
            indegre[v]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegre[i]==0){
                q.add(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            int node=q.poll();
            count++;
            for(int neighbor:adj.get(node)){
                indegre[neighbor]--;
                if(indegre[neighbor]==0) q.add(neighbor);
            }
        }
        return count!=V;
    }
}