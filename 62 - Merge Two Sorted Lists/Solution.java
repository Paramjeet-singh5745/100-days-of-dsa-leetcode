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
        ListNode d=new ListNode(-1);
        ListNode ans=d;

        ListNode l1=list1;
        ListNode l2=list2;

        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                d.next=l1;
                l1=l1.next;
            }
            else{
                d.next=l2   ;
                l2=l2.next;
            }
            d=d.next;
        }

        if(l1==null){
            d.next=l2;
        }
        else{
            d.next=l1;
        }
        return ans.next;
    }
}
