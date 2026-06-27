class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int fina[]=new int[nums1.length+nums2.length];
       int s1=0,s2=0;
       int i=0;
       for(;i<fina.length;i++){
            if(s1<nums1.length && s2<nums2.length){
                if(nums1[s1]<nums2[s2]){
                    fina[i]=nums1[s1];
                    s1++;
                }
                else{
                    fina[i]=nums2[s2];
                    s2++;
                }
            }
            else break;
       }
       while(s1<nums1.length){
        fina[i]=nums1[s1];
        i++;
        s1++;
       }
        while(s2<nums2.length){
        fina[i]=nums2[s2];
        i++;
        s2++;
       }
        if(fina.length%2!=0) return (double) fina[fina.length/2];
        double ans=(double) (fina[fina.length/2]+fina[(fina.length/2)-1])/2;
        return ans;
    }
}