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
        Stack<Integer> st=new Stack<>();
        ListNode p=head;

        while(p!=null){
            st.push(p.val);
            p=p.next;
        }
        ListNode p2=head;

        while(p2!=null){
            int val1=p2.val;
            int val2=st.pop();

            if(val1!=val2){
                return false;
            }

            p2=p2.next;
        }

        return true;

    }
}
