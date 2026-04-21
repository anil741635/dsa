/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
    
        Node a=head1,b=head2;
        if(a==null && b==null) return null;
        while(a!=b) {
            if(a!=null) a=a.next;
            else a=head2;
            if(b!=null) b=b.next;
            else b=head1;
        }
        return a;
    }
}