# 80 - Binary Tree Postorder Traversal

🔗 [LeetCode Problem Link](https://leetcode.com/problems/binary-tree-postorder-traversal/)  
📌 Difficulty: Easy  
📚 Topic: Binary Tree / DFS  
🖥️ Language: Java  

## 💡 Approach
- **Recursive DFS:** Visit left → right → root.  
- **Iterative Stack:** Use a stack with `(node, visited)` flag to simulate recursion.  

## ⏱️ Complexity
- **Time:** O(N), since each node is visited once.  
- **Space:** O(H) recursion stack (DFS) or O(N) for stack (iterative).  

## ✅ Code
See `binary_tree_postorder_traversal.java` in this folder.
