class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        ArrayList<Integer> result=new ArrayList<>();
        visited.add(0);
        q.add(0);
        while(!q.isEmpty()){
                int node=q.poll();
                result.add(node);
                for(int neighbor:adj.get(node)){
                    if(!visited.contains(neighbor)){
                        visited.add(neighbor);
                        q.add(neighbor);
                    }
                }
        }
        return result;
    }
}