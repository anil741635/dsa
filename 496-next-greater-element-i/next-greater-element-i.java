class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int find=nums1[i];
            arr[i]=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==find){
                    for(int k=j+1;k<nums2.length;k++){
                            if(find<nums2[k]){
                                arr[i]=nums2[k];
                                break;
                            }
                    }
                }
            }
        }
        return arr;
    }
}