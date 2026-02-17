class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        int ans=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ans) ans++;
            else{
                break;
            }
        }
        return ans;
    }
}