# 94 - Lowest Common Ancestor of a Binary Search Tree

🔗 [LeetCode Problem Link](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/)  
📌 Difficulty: Medium  
📚 Topic: Tree / BST  
🖥️ Language: Java  

## 💡 Approach
- If both nodes’ values < root → recurse left.  
- If both nodes’ values > root → recurse right.  
- Else, root is the split point → the LCA.  
- Works iteratively and recursively.  

## ✅ Code
See `lowest_common_ancestor_bst.java` in this folder.
