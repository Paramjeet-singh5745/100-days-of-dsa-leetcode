# 77 - Univalued Binary Tree

🔗 [LeetCode Problem Link](https://leetcode.com/problems/univalued-binary-tree/)  
📌 Difficulty: Easy  
📚 Topic: Binary Tree  
🖥️ Language: Java  

## 💡 Approach
1. Store the root’s value.  
2. Traverse the entire tree (DFS or BFS).  
3. If any node’s value ≠ root’s value → return false.  
4. If all nodes match → return true.  

## ⏱️ Complexity
- **Time:** O(N), where N = number of nodes.  
- **Space:** O(H), where H = height of the tree (recursion stack).  

## ✅ Code
See `univalued_binary_tree.java` in this folder.
