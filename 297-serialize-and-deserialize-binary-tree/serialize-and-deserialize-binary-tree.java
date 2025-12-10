/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root==null)
            return "null";
            return root.val+","+serialize(root.left)+","+serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        int index[]={0};
        String[] values=data.split(",");
        return build(values,index);
    }
    public TreeNode build(String values[],int index[])
    {
        if(values[index[0]].equals("null"))
        {
            index[0]++;
            return null;
        }
        TreeNode node=new TreeNode(Integer.parseInt(values[index[0]]));
        index[0]++;
        node.left=build(values,index);
        node.right=build(values,index);
        return node;
    }
}