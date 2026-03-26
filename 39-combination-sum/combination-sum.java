class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        combination(0,candidates,target,new ArrayList<>(),res);
        return res;
    }
    public static void combination(int ind,int candidate[],int target,ArrayList<Integer> temp,List<List<Integer>> res)
    {
        if(target==0)
        {
            res.add(new ArrayList<Integer>(temp));
        }
        if(ind>=candidate.length || target<0)
        {
            return;
        }
        for(int i=ind;i<candidate.length;i++)
        {
            temp.add(candidate[i]);
            combination(i,candidate,target-candidate[i],temp,res);
            temp.remove(temp.size()-1);
        }
    }
}