# 95 - Validate Binary Search Tree

🔗 [LeetCode Problem Link](https://leetcode.com/problems/validate-binary-search-tree/)  
📌 Difficulty: Medium  
📚 Topic: Tree / BST  
🖥️ Language: Java  

## 💡 Approach
- Recursive DFS with `min` and `max` limits.  
- At each node:  
  - Left child value < root.  
  - Right child value > root.  
- Valid if all nodes respect the boundaries.  

### Alternative:
- Perform inorder traversal.  
- If traversal list is strictly increasing → valid BST.  

## ✅ Code
See `validate_binary_search_tree.java` in this folder.
