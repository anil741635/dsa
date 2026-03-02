class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int arr[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            arr[i]=a[i];
        }
        int j=0;
        for(int i=a.length;i<a.length+b.length;i++){
            arr[i]=b[j++];
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}