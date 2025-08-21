# 78 - Count Complete Tree Nodes

🔗 [LeetCode Problem Link](https://leetcode.com/problems/count-complete-tree-nodes/)  
📌 Difficulty: Easy  
📚 Topic: Binary Tree / Binary Search  
🖥️ Language: Java  

## 💡 Approach
- Compute left and right heights of the tree.  
- If both heights are equal → left subtree is a complete binary tree.  
- Else → right subtree is a complete binary tree.  
- Recursively count nodes with O(log²n) complexity.  

## ✅ Code
See `count_complete_tree_nodes.java` in this folder.
