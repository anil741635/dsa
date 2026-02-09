class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        Stack<Integer> st=new Stack<>();
        HashSet<Integer> visited=new HashSet<>();
        ArrayList<Integer> result=new ArrayList<>();
        st.push(0);
        while(!st.isEmpty()){
            int node=st.pop();
            if (!visited.contains(node)) {
                    visited.add(node);
                    result.add(node);
                ArrayList<Integer> neighbors=adj.get(node);
                for(int i=neighbors.size()-1;i>=0;i--){
                    int neighbor=neighbors.get(i);
                    if(!visited.contains(neighbor)){
                        st.push(neighbor);
                    }
                }
            }
        }
        return result;
    }
}