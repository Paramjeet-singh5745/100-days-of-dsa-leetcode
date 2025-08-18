# 58 - Spiral Matrix II

🔗 [LeetCode Problem Link](https://leetcode.com/problems/spiral-matrix-ii/)  
📌 Difficulty: Medium  
📚 Topic: Matrix Simulation  
🖥️ Language: Java  

## 💡 Approach
- Start with an empty `n x n` matrix.  
- Fill numbers from 1 to n² in spiral order.  
- Track **4 boundaries** (top, bottom, left, right).  
- After completing each side, shrink the boundary inward.  

## ⏱️ Complexity
- **Time:** O(n²) (each element filled once)  
- **Space:** O(1) (apart from output matrix)  

## ✅ Code
See `spiral_matrix_ii.java` in this folder.
