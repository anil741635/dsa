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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=list1;
        ArrayList<ListNode> list=new ArrayList<>();
        while(temp!=null){
            list.add(temp);
            temp=temp.next;
        }
        ListNode temp1=list2;
        while(temp1!=null){
            list.add(temp1);
            temp1=temp1.next;
        }
        Collections.sort(list ,(a,b)->a.val-b.val);
        ListNode newhead=new ListNode(0);
        ListNode dummy=newhead;
        for(ListNode i:list){
            i.next=null;
            dummy.next=i;
            dummy=dummy.next;
        }
        return newhead.next;
    }
}