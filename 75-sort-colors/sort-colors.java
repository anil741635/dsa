class Solution {
    public void sortColors(int[] nums) {
        int zerocount=0;
        int onecount=0;
        int twocount=0;
        for(int i=0;i<nums.length;i++)
        {
                if(nums[i]==0)
                    zerocount++;
                if(nums[i]==1)
                    onecount++;
                if(nums[i]==2)
                    twocount++;
        }
       
        for(int i=0;i<zerocount;i++){
            nums[i]=0;
        }
         for(int i=zerocount;i<onecount+zerocount;i++){
            nums[i]=1;
        }
         for(int i=onecount+zerocount;i<nums.length;i++){
            nums[i]=2;
        }
        for(int i:nums)
        {
            System.out.println(i);
        }
    }
}