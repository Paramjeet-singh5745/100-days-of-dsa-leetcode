# 85 - Kth Smallest Element in a BST

🔗 [LeetCode Problem Link](https://leetcode.com/problems/kth-smallest-element-in-a-bst/)  
📌 Difficulty: Medium  
📚 Topic: Binary Search Tree / Inorder Traversal  
🖥️ Language: Java  

## 💡 Approach
- Performed **inorder traversal** of the BST, which produces sorted values.  
- Counted nodes during traversal until reaching the **k-th element**.  
- Also considered **iterative stack-based solution** to handle large trees without deep recursion.  

## ⏱️ Complexity
- **Time:** O(H + k), where H = height of tree (best when k is small).  
- **Space:** O(H), recursion/stack space.  

## ✅ Code
See `kth_smallest_element_in_a_bst.java` in this folder.
