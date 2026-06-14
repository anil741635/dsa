class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int count=0;
        Set<Integer> set=new HashSet<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(!set.contains(i)){
                q.add(i);
                set.add(i);
                count++;
                while(!q.isEmpty()){
                    int value=q.poll();
                    for(int neighbor=0;neighbor<n;neighbor++){
                        if(isConnected[value][neighbor]==1 && !set.contains(neighbor)){
                            q.add(neighbor);
                            set.add(neighbor);
                        }
                    }
                }
            }
        }
        return count;
    }
}