class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        int ans=1;
        for(int i:arr){
            if(i==ans) ans++;
            else{
                break;
            }
        }
        return ans;
    }
}