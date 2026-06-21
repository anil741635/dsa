class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Set<List<Integer>> set=new HashSet<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++) map.put(nums[i],i);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum=nums[i]+nums[j];
                if(map.containsKey(-sum)){
                    int k=map.get(-sum);
                   if (k!=i && k!=j){
                    ArrayList<Integer> temp=new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(-sum);
                            //list.add(temp);
                            Collections.sort(temp);
                            set.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}