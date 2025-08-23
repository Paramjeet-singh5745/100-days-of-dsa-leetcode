# 81 - Binary Tree Level Order Traversal

🔗 [LeetCode Problem Link](https://leetcode.com/problems/binary-tree-level-order-traversal/)  
📌 Difficulty: Medium  
📚 Topic: Binary Tree / BFS  
🖥️ Language: Java  

## 💡 Approach
- Used **BFS (queue)** to traverse the tree level by level.  
- For each level, iterated through nodes and added their children to the queue.  
- Stored node values in a **list of lists** to represent levels.  

## ⏱️ Complexity
- **Time:** O(N), visiting all nodes once.  
- **Space:** O(N), queue to store nodes at each level.  

## ✅ Code
See `binary_tree_level_order_traversal.java` in this folder.
