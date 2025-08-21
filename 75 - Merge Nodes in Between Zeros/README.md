# 75 - Merge Nodes in Between Zeros

🔗 [LeetCode Problem Link](https://leetcode.com/problems/merge-nodes-in-between-zeros/)  
📌 Difficulty: Medium  
📚 Topic: Linked List  
🖥️ Language: Java  

## 💡 Approach
1. Use a **dummy node** to simplify list creation.  
2. Traverse through the list:  
   - Keep adding values until reaching `0`.  
   - On encountering `0`, create a new node with the accumulated sum.  
   - Reset the sum and continue.  
3. Skip the first and last zero nodes as they are just separators.  

## ⏱️ Complexity
- **Time:** O(n) (single traversal of the list)  
- **Space:** O(1) (only dummy node used)  

## ✅ Code
See `merge_nodes_between_zeros.java` in this folder.
