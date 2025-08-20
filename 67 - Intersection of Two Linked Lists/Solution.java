/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public static int sizell(ListNode head){
        ListNode ptr=head;
        int count=0;
        while(ptr!=null){
            ptr=ptr.next;
            count++;
        }

        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1=sizell(headA);
        int size2=sizell(headB);
        ListNode ptr1=headA;
        ListNode ptr2=headB;
        int dif=size1-size2;
        if(dif>0){
            while(dif>0){
            ptr1=ptr1.next;
            dif--;
            }
        }
        else{
            while(dif<0){
            ptr2=ptr2.next;
            dif++;
            }
        }

        while(ptr1!=ptr2){
            ptr1=ptr1.next;
            ptr2=ptr2.next;

        }

        return ptr1;
    }
}
