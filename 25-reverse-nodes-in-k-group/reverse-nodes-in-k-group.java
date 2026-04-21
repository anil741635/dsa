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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode previous=null;
        while(temp!=null){
            ListNode kth=check(temp,k);
            if(kth==null) {
                break;
            }
            ListNode nextnode=kth.next;
            kth.next=null;
            ListNode newhead=reverse(temp);
            if(temp==head){
                head=newhead;
            }
            else{
                previous.next=newhead;
            }
            temp.next=nextnode;
            previous=temp;
            temp=nextnode;
        }
        return head;
    }
    public static ListNode check(ListNode temp,int k){
        while(temp!=null && k>1){
            temp=temp.next;
            k--;
        }
        return temp;
    }
    public static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        return prev;
    }
}