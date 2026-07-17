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
        if(head==null || head.next==null){
            return true;
        }
        ListNode dummy=new ListNode(head.val);
        ListNode t1=dummy;
        ListNode t2=head.next;
        while(t2!=null){
            t1.next=new ListNode(t2.val);
            t1=t1.next;
            t2=t2.next;
        }
        ListNode  prev=head;
        ListNode curr=head.next;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=next;
        }
        head.next=null;
        head=prev;
        ListNode p1=prev;
        ListNode p2=dummy;
        while(p1!=null && p2!=null){
            if(p1.val!=p2.val){
                return false;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }
}
