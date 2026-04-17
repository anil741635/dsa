class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int temp[]=new int[arr.length];
       for(int i=0;i<arr.length;i++){
        temp[i]=arr[i];
       }
       int rank=1;
       Arrays.sort(temp);
       Map<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<arr.length;i++){
        if(!map.containsKey(temp[i])){
            map.put(temp[i],rank);
            rank++;
        }
       }
       for(int i=0;i<arr.length;i++){
        arr[i]=map.get(arr[i]);
       }
       return arr;
    }
}