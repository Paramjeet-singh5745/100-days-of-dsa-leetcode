# 84 - Balanced Binary Tree

🔗 [LeetCode Problem Link](https://leetcode.com/problems/balanced-binary-tree/)  
📌 Difficulty: Easy  
📚 Topic: Binary Tree / DFS  
🖥️ Language: Java  

## 💡 Approach
- Used **recursive DFS** to compute height of left and right subtrees.  
- If difference in heights > 1, returned false.  
- Returned **-1 flag** to stop further checks once imbalance detected.  

## ⏱️ Complexity
- **Time:** O(N), visiting each node once.  
- **Space:** O(H), recursion stack (H = tree height).  

## ✅ Code
See `balanced_binary_tree.java` in this folder.
