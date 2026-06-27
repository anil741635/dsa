class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int fina[]=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            fina[i]=nums1[i];
        }
        int left=0;
        for(int i=nums1.length;i<fina.length;i++){
            fina[i]=nums2[left++];
        }
        Arrays.sort(fina);
        if(fina.length%2!=0) return (double) fina[fina.length/2];
        double ans=(double) (fina[fina.length/2]+fina[(fina.length/2)-1])/2;
        return ans;
    }
}