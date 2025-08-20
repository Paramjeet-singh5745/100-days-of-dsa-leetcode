# 69 - Delete Node in a Linked List

🔗 [LeetCode Problem Link](https://leetcode.com/problems/delete-node-in-a-linked-list/)  
📌 Difficulty: Medium  
📚 Topic: Linked List  
🖥️ Language: Java  

## 💡 Approach
1. Since we don’t have the head, we can’t find the previous node.  
2. Copy the value from the **next node** into the given node.  
3. Point current node’s `next` to `next.next`, effectively deleting the original next node.  
4. Works only because the node to delete is **not the tail**.  

## ⏱️ Complexity
- **Time:** O(1) → just copy & link change.  
- **Space:** O(1) → no extra memory.  

## ✅ Code
See `delete_node_in_linked_list.java` in this folder.
