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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
       while(temp!=null){
        list.add(temp.val);
        temp=temp.next;
       }
       if(palindrome(list)){
        return true;
       }
       else{
        return false;
       }
    }
    public static boolean palindrome(ArrayList<Integer> list){
        int left=0,right=list.size()-1;
        while(left<right){
            if(list.get(left)!=list.get(right)){
                    return false;
            }
            left++;
            right--;
        }
        return true;
    }
}