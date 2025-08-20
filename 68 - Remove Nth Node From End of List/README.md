# 68 - Remove Nth Node From End of List

🔗 [LeetCode Problem Link](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)  
📌 Difficulty: Medium  
📚 Topic: Linked List / Two-Pointer  
🖥️ Language: Java  

## 💡 Approach
1. Create two pointers `fast` and `slow`.  
2. Move `fast` pointer `n` steps ahead.  
3. Move both `fast` and `slow` until `fast.next == null`.  
4. Now `slow.next` is the node to be deleted → update `slow.next = slow.next.next`.  
5. Edge case: If `n` equals list length → remove head.  

## ⏱️ Complexity
- **Time:** O(n) → single traversal.  
- **Space:** O(1) → no extra memory used.  

## ✅ Code
See `remove_nth_node_from_end_of_list.java` in this folder.
