/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        
        traverse(root,list);
        return list;
    }
    public static void traverse(Node root,ArrayList<Integer> list){
        if(root==null) return ;
        traverse(root.left,list);
        list.add(root.data);
        traverse(root.right,list);
    }
}