class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                swap(i,j,arr);
                j++;
            }
        }
    }
    public static void swap(int i,int j,int[] arr){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    }
}