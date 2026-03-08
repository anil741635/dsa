class Solution {
    public boolean findTriplets(int[] arr) {
        // code here.
        for(int i=0;i<arr.length;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i+1;j<arr.length;j++){
                int remain=-(arr[i]+arr[j]);
                if(set.contains(remain)) return true;
                set.add(arr[j]);
            }
        }
        return false;
    }
}