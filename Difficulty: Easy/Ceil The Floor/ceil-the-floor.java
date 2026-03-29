// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int ceil=-1,floor=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x){
                floor=Math.max(arr[i],floor);
            }
             if(arr[i]>=x){
                if(ceil==-1) ceil=arr[i];
                else
                    ceil=Math.min(arr[i],ceil);
            }
        }
        return new int[] {floor,ceil};
    }
}
