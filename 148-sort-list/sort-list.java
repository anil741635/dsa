/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null) return null;
        ArrayList<ListNode> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp);
            temp=temp.next;
        }
        Collections.sort(list,(a,b) -> a.val-b.val);
        ListNode newhead=new ListNode(0);
         temp=newhead;
        for(ListNode node:list){
            node.next=null;
            temp.next=node;
            temp=temp.next;
        }
        return newhead.next;
    }
}