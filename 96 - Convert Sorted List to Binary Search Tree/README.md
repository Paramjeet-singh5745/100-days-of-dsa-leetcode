# 96 - Convert Sorted List to Binary Search Tree

🔗 [LeetCode Problem Link](https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/)  
📌 Difficulty: Medium  
📚 Topic: Linked List / Tree / Divide & Conquer  
🖥️ Language: Java  

## 💡 Approach
- Use fast & slow pointer to find middle of the list.  
- Middle becomes root.  
- Left half → recursively forms left subtree.  
- Right half → recursively forms right subtree.  
- Ensures balanced BST structure.  

### Alternative:
- Convert list to array, then apply array-to-BST logic.  
- Uses extra space but simpler.  

## ✅ Code
See `convert_sorted_list_to_bst.java` in this folder.
