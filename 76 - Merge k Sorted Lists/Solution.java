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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        else if(lists.length==1){
            return lists[0];
        }
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);

        for(int i=0;i<lists.length;i++){
            ListNode temph=lists[i];

            while(temph!=null){
                pq.add(temph);
                temph=temph.next;
            }
        }

        ListNode d=new ListNode(-1);
        ListNode ans=d;
        while(pq.size()>0){
            ListNode temp=pq.remove();
            d.next=temp;
            d=d.next;
        }
        d.next=null;
        return ans.next;
    }
}
