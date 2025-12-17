class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer>[] bucket=new List[nums.length+1];
        for(int num:map.keySet())
        {
            int freq=map.get(num);
            if(bucket[freq] ==null)
            {
                bucket[freq]=new ArrayList();
            }
            bucket[freq].add(num);
        }
        int[] res=new int[k];
        int index=0;
        for(int i=bucket.length-1;i>=0 && index<k;i--)
        {
            if(bucket[i]!=null){
                for(int j:bucket[i]){
                    res[index++]=j;
                    if(index==k)
                    {
                        break;
                }    }
            }
        }
        return res;
    }
}