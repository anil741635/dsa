/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Node> st1=new Stack<>();
       Stack<Node> st2=new Stack<>();
       st1.push(root);
       while(!st1.isEmpty()){
           Node curr=st1.pop();
           st2.push(curr);
           if(curr.left!=null) st1.push(curr.left);
           if(curr.right!=null) st1.push(curr.right);
       }
       while(!st2.isEmpty()){
           list.add(st2.pop().data);
       }
       return list;
    }
}