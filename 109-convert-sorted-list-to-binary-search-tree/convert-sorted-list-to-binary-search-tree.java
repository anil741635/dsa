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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int[] arr=new int[count];
        temp=head;
        int i=0;
        while(temp!=null){
            arr[i++]=temp.val;
             temp=temp.next;
        }
        int start=0,end=arr.length-1;
        return helper(arr,start,end);
    }
    public static TreeNode helper(int arr[],int start,int end){
        if(start>end) return null;
            int mid=start+(end-start)/2;
            TreeNode root=new TreeNode(arr[mid]);
            root.left=helper(arr,start,mid-1);
            root.right=helper(arr,mid+1,end);
            return root;
    }
}