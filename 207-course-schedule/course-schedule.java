class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int n=numCourses;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree=new int[n];
        for(int i[]:prerequisites){
            int u=i[0];
            int v=i[1];
            adj.get(v).add(u);
            indegree[u]++;
        }
        Queue<Integer> q=new LinkedList<>();
        int count=0;
        for(int i=0;i<n;i++){
            if(indegree[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int value=q.poll();
            count++;
            for(int neighbor:adj.get(value)){
                indegree[neighbor]--;
                if(indegree[neighbor]==0) q.add(neighbor);
            }
        }
        return count==n;
    }
}