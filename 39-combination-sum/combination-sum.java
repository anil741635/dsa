class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        backtracking(candidates,0,target,new ArrayList<Integer>(),result);
        return result;
    }
    public static void backtracking(int[] arr,int start,int target,ArrayList<Integer> list,List<List<Integer>> result){
        if(target<0) return;
        if(target==0){
         result.add(new ArrayList(list));
         return;
        }
        for(int i=start;i<arr.length;i++){
            list.add(arr[i]);
            backtracking(arr,i,target-arr[i],list,result);
             list.remove(list.size()-1);
        }
    }
}