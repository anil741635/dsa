/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
        Node temp=head;
        Node track=null;
        Set<Node> set=new HashSet<>();
        while(temp!=null){
            if(set.contains(temp)){
                track.next=null;
                return;
            }
            set.add(temp);
            track=temp;
            temp=temp.next;
        }
    }
}