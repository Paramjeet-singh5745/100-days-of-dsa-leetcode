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
    public ListNode reversel(ListNode head){
        ListNode curr=head;
        ListNode pre=null;

        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=pre;
            pre=curr;
            curr=temp;
        }

        return pre;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode nhead=reversel(head);

        ListNode d=new ListNode(-1);
        ListNode ans=d;
        int carry=0;
        while(nhead!=null){
            int sum=nhead.val+nhead.val+carry;
            int last=sum%10;
            carry=sum/10;
            ListNode temp=new ListNode(last);
            d.next=temp;
            d=d.next;
            nhead=nhead.next;

        }

        if(carry>0){
            ListNode temp=new ListNode(carry);
            d.next=temp;
            d=d.next;
        }

        ans=reversel(ans.next);
        return ans;
    }
}
