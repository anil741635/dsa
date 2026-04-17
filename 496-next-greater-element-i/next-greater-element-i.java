class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int[nums2.length];
       Stack<Integer> st=new Stack<>();
       for(int i=nums2.length-1;i>=0;i--){
        while(!st.isEmpty() && nums2[i]>=st.peek()){
            st.pop();
        }
        arr[i]=st.isEmpty()? -1:st.peek();
        st.push(nums2[i]);
       }
       for(int i=0;i<nums1.length;i++){
        for(int j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j]) {
                nums1[i]=arr[j];
                break;
            }
        }
       }
       return nums1;
    }
}