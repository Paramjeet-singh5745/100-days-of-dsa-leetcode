# 74 - Delete the Middle Node of a Linked List

🔗 [LeetCode Problem Link](https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/)  
📌 Difficulty: Medium  
📚 Topic: Linked List / Two-Pointer  
🖥️ Language: Java  

## 💡 Approach
1. If the list has only **one node**, return `null`.  
2. Use **slow** and **fast** pointers:  
   - Slow moves one step, Fast moves two steps.  
   - When Fast reaches the end, Slow is at the middle.  
3. Maintain a `prev` pointer to skip the middle node by adjusting links.  

## ⏱️ Complexity
- **Time:** O(n) (single traversal with two pointers)  
- **Space:** O(1) (in-place modification)  

## ✅ Code
See `delete_middle_node_linked_list.java` in this folder.
