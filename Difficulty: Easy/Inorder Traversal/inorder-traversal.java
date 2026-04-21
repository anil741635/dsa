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
        
        return traverse(root,list);
    }
    public static ArrayList<Integer> traverse(Node root,ArrayList<Integer> list){
        if(root==null) return list;
        traverse(root.left,list);
        list.add(root.data);
        traverse(root.right,list);
        return list;
    }
}