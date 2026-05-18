/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer> map=new HashMap<>();
        helper(root,map);
        int maxi=0;
        for(int i:map.keySet()){
            if(map.get(i)>maxi) maxi=map.get(i);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i)==maxi) list.add(i);
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
    public static void helper(TreeNode root,Map<Integer,Integer> map){
        if(root==null) return;
        map.put(root.val,map.getOrDefault(root.val,0)+1);
         helper(root.left,map);
        helper(root.right,map);
    }
}