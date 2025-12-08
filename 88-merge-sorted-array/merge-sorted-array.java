class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m;i<nums1.length;i++)
        {
            if(nums1[i]==0){
                nums1[i]=nums2[j++];
            }
        }
        Arrays.sort(nums1);
        for(int i:nums1)
        {
            System.out.println(i);
        }
    }
}