class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] color=new int[n];
        Queue<Integer> q=new LinkedList<>();
        Arrays.fill(color,-1);
       for(int i=0;i<n;i++){
        if(color[i]==-1){
            color[i]=0;
            q.add(i);
        }
            while(!q.isEmpty()){
                int value=q.poll();
                for(int neighbor:graph[value]){
                    if(color[neighbor]==-1){
                        color[neighbor]=1-color[value];
                        q.add(neighbor);
                    } 
                    else if(color[value]==color[neighbor]){
                        return false;
                    }
                }
            }
       }
        return true;
    }
}