class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int temp=k;
       return nums[nums.length-k];
    }
}