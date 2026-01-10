class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        ArrayList<int[]> result=new ArrayList<>();
        if(intervals.length<=1){
            return intervals;
        }
        int[] interval=intervals[0];
        result.add(interval);
        for(int i=1;i<intervals.length;i++){
            int[] next=intervals[i];
            if(next[0]<=interval[1]){
                interval[1]=Math.max(interval[1],next[1]);
            }
            else{
                interval=next;
                result.add(interval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}