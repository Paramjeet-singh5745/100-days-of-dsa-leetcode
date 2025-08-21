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
    public ListNode mergeNodes(ListNode head) {
        ListNode d=new ListNode(-1);
        ListNode ans=d;
        ListNode cur=head.next;
        int sum=0;

        while(cur!=null){
            if(cur.val!=0){
                sum+=cur.val;
            }

            else{
                ListNode temp=new ListNode(sum);
                d.next=temp;
                d=d.next;
                sum=0;
            }

            cur=cur.next;
        }
        return ans.next;
    }
}
