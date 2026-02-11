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
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode slow=head;
        ListNode prev=null;
        while(slow!=null){
           ListNode temp=slow.next;
           slow.next=prev;
           prev=slow;
           slow=temp;
        }
        return prev;
    }
}