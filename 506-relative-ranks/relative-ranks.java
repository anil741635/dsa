class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] str=new String[n];
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=score[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(a,b)->b[0]-a[0]);
        int left=0;
        for(int i=0;i<n;i++){
            int index=arr[i][1];
            if(left==0)
                str[index]="Gold Medal";
            else if(left==1)
                    str[index]="Silver Medal";
            else if(left==2)
                str[index]="Bronze Medal";

            else{
                str[index]=String.valueOf(left+1);
            }
            left++;
        }
    return str;
    }
}