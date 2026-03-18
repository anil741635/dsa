class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n=numCourses;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegre=new int[n];
        for(int[] edge:prerequisites){
            int u=edge[0];
            int v=edge[1];
            adj.get(v).add(u);
            indegre[u]++;
        }
        Queue<Integer> q=new LinkedList<>();
       int[] result=new int[n];
       int index=0;
        for(int i=0;i<n;i++){
            if(indegre[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int node=q.poll();
            result[index++]=node;
            for(int neighbor:adj.get(node)){
                indegre[neighbor]--;
                if(indegre[neighbor]==0) q.add(neighbor);
            }
        }
        if(index!=n) return new int[0];
        return result;
    }
}
   