class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public static void mergeSort(int[] nums,int start,int end){
        if(start<end){
            int mid=start+(end-start)/2;
            mergeSort(nums,start,mid);
            mergeSort(nums,mid+1,end);
            merge(nums,start,mid,end);
        }
    }
    public static void merge(int[] nums,int start,int mid,int end){
        ArrayList<Integer> list=new ArrayList<>();
        int left=start,high=mid+1;
        while(left<=mid && high<=end){
            if(nums[left]<=nums[high]){
                list.add(nums[left]);
                left++;
            }
            else{
                list.add(nums[high]);
                high++;
            }
        }
        while(left<=mid){
            list.add(nums[left]);
            left++;
        }
        while(high<=end){
            list.add(nums[high]);
            high++;
        }
        for(int i=0;i<list.size();i++){
            nums[start+i]=list.get(i);
        }
    }
}