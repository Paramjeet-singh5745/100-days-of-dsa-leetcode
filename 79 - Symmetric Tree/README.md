# 79 - Symmetric Tree

🔗 [LeetCode Problem Link](https://leetcode.com/problems/symmetric-tree/)  
📌 Difficulty: Easy  
📚 Topic: Binary Tree / DFS-BFS  
🖥️ Language: Java  

## 💡 Approach
- Base check: if root is null → symmetric.  
- Recursively compare left and right subtrees in mirror order.  
- Iterative BFS: enqueue pairs `(left, right)` and check symmetry level by level.  

## ⏱️ Complexity
- **Time:** O(N), since all nodes are checked once.  
- **Space:** O(H) for recursion stack (DFS) or O(N) for queue (BFS).  

## ✅ Code
See `symmetric_tree.java` in this folder.
