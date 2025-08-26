# 99 - Binary Search Tree to Greater Sum Tree

🔗 [LeetCode Problem Link](https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/)  
📌 Difficulty: Medium  
📚 Topic: Tree / DFS / BST  
🖥️ Language: Java  

## 💡 Approach
- Perform **reverse inorder traversal** (right → root → left).  
- Maintain a running sum of all visited nodes.  
- Update each node’s value = node value + running sum.  
- Recursive method ensures O(n) time and O(h) space (h = tree height).  

## ✅ Code
See `bst_to_greater_sum_tree.java` in this folder.
