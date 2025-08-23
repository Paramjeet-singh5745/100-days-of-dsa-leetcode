# 83 - Binary Tree Zigzag Level Order Traversal

🔗 [LeetCode Problem Link](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)  
📌 Difficulty: Medium  
📚 Topic: Binary Tree / BFS  
🖥️ Language: Java  

## 💡 Approach
- Used **Queue for BFS** traversal.  
- At each level, stored nodes in a list.  
- If the level is odd, reversed the list to achieve the **zigzag effect**.  
- Continued until all levels were processed.  

## ⏱️ Complexity
- **Time:** O(N), visiting each node once.  
- **Space:** O(N), for the queue and result storage.  

## ✅ Code
See `binary_tree_zigzag_level_order_traversal.java` in this folder.
