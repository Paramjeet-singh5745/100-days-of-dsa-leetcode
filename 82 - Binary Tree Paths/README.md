# 82 - Binary Tree Paths

🔗 [LeetCode Problem Link](https://leetcode.com/problems/binary-tree-paths/)  
📌 Difficulty: Easy  
📚 Topic: Binary Tree / DFS  
🖥️ Language: Java  

## 💡 Approach
- Used **DFS recursion** to traverse the tree.  
- Appended node values with `"->"` when moving down the tree.  
- When a **leaf node** was reached, added the full path to the result list.  

## ⏱️ Complexity
- **Time:** O(N), visiting each node once.  
- **Space:** O(H), where H is the height of the tree (recursion stack).  

## ✅ Code
See `binary_tree_paths.java` in this folder.
