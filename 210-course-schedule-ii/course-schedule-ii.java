class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int n=numCourses;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree=new int[n];
        int[] res=new int[n];
        int index=0;
        for(int edge[]:prerequisites){
            int u=edge[0];
            int v=edge[1];
            adj.get(v).add(u);
            indegree[u]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int value=q.poll();
            res[index++]=value;
            for(int neighbor:adj.get(value)){
                indegree[neighbor]--;
                if(indegree[neighbor]==0)q.add(neighbor);
            }
        }
        if(index!=n) return new int[0];
        return res;
    }
}