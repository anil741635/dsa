class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegre=new int[numCourses];
        for(int[] edge:prerequisites){
            int u=edge[0];
            int v=edge[1];
            adj.get(v).add(u);
            indegre[u]++;
        }
        int count=0;
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++ ){
            if(indegre[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int node=q.poll();
            count++;
            for(int neighbor:adj.get(node)){
                indegre[neighbor]--;
                if(indegre[neighbor]==0) q.add(neighbor);
            }
        }
        return count==numCourses;
    }
}