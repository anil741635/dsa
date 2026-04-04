class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
       int first=-1,second=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                first=i;
                break;
            }
        }
        list.add(first);
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==x){
                second=i;
                break;
            }
        }
        list.add(second);
        return list;
    }
}
