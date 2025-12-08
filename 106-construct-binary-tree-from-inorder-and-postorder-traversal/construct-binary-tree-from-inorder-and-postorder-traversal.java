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
   int index;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
         index=postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(inorder,postorder,0,inorder.length-1,map);
    }
    public  TreeNode helper(int[] inorder,int[] postorder,int start,int end,HashMap<Integer,Integer> map)
    {
        if(start>end)
        {
            return null;
        }
        int rootval=postorder[index--];
        TreeNode node=new TreeNode(rootval);
        int inorderIndex=map.get(rootval);
        node.right=helper(inorder,postorder,inorderIndex+1,end,map);
        node.left=helper(inorder,postorder,start,inorderIndex-1,map);
        return node;
    }
}