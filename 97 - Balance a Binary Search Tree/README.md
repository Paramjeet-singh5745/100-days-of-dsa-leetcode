# 97 - Balance a Binary Search Tree

🔗 [LeetCode Problem Link](https://leetcode.com/problems/balance-a-binary-search-tree/)  
📌 Difficulty: Medium  
📚 Topic: Tree / DFS / Divide & Conquer  
🖥️ Language: Java  

## 💡 Approach
- Do **inorder traversal** of the BST → get sorted list of nodes.  
- Use the sorted list to build a balanced BST:  
  - Pick middle as root.  
  - Left half → left subtree.  
  - Right half → right subtree.  
- Balanced tree ensures logarithmic height.  

### Complexity:
- Time: O(n) (traverse + build).  
- Space: O(n) (store nodes).  

## ✅ Code
See `balance_bst.java` in this folder.
