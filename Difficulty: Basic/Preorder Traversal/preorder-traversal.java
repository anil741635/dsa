/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Node> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node temp=st.pop();
            list.add(temp.data);
            if(temp.right!=null){
                
                st.push(temp.right);
            } 
            if(temp.left!=null){
                st.push(temp.left);
            } 
        }
        return list;
    }
    
}