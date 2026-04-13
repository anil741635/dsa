/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
       Stack<Node> st=new Stack<>();
       Node temp=head;
       while(temp!=null){
            st.add(temp);  
            temp=temp.next;
       }
       Node newhead=st.pop();
       Node temps=newhead;
       while(!st.isEmpty()){
           temps.next=st.pop();
           temps=temps.next;
       }
       temps.next=null;
       return newhead;
    }
}