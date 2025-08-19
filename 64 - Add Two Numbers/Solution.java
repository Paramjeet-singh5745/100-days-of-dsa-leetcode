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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        } else if(l2==null){
            return l1;
        }

        ListNode d=new ListNode(-1);
        ListNode ans=d;

        ListNode p1=l1;
        ListNode p2=l2;
        int carry=0;
        while(p1!=null || p2!=null){
            int val1=p1!=null?p1.val:0; 
            int val2=p2!=null?p2.val:0; 

            int sum=val1+val2+carry;
            int last=sum%10;
            carry=sum/10;
            ListNode temp=new ListNode(last);
            d.next=temp;
            d=d.next;
            p1=p1!=null?p1.next:null;
            p2=p2!=null?p2.next:null;
        }
        if(carry>0){
            ListNode temp=new ListNode(carry);
            d.next=temp;
            d=d.next;
        }
        return ans.next;
    }
}
