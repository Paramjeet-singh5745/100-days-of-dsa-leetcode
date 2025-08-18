# 57 - Transpose Matrix

🔗 [LeetCode Problem Link](https://leetcode.com/problems/transpose-matrix/)  
📌 Difficulty: Easy  
📚 Topic: Matrix  
🖥️ Language: Java  

## 💡 Approach
- Initialize a new matrix of size `m x n` → `n x m`.  
- For each element `(i, j)` in the original matrix, assign it to `(j, i)` in the new matrix.  
- Works for both square and rectangular matrices.  

## ⏱️ Complexity
- **Time:** O(m * n)  
- **Space:** O(m * n) (new matrix created)  

## ✅ Code
See `transpose_matrix.java` in this folder.
