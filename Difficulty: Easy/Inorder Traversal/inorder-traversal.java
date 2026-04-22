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
        Stack<Node> st=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();
        Node node=root;
        while(node!=null || !st.isEmpty()){
            while(node!=null){
                st.push(node);
                node=node.left;
            }
            node=st.pop();
            list.add(node.data);
            node=node.right;
        }
        return list;
    }
    
}