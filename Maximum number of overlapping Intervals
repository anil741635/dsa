
class Solution {
    public static int overlapInt(int[][] arr) {
        // code here
        int[] start=new int[arr.length];
        int[] end=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            start[i]=arr[i][0];
            end[i]=arr[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int i=0,j=0,count=0,maxcount=0;
        while(i<start.length && j<end.length){
            if(start[i]<=end[j]){
                count++;
                maxcount=Math.max(maxcount,count);
                i++;
            }
            else{
                count--;
                j++;
            }
        }
        return maxcount;
    }
}
