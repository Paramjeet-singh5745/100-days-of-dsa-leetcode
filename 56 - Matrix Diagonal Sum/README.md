# 56 - Matrix Diagonal Sum

🔗 [LeetCode Problem Link](https://leetcode.com/problems/matrix-diagonal-sum/)  
📌 Difficulty: Easy  
📚 Topic: Matrix / Simulation  
🖥️ Language: Java  

## 💡 Approach
- Traverse the matrix using an index `i` from `0` to `n-1`.  
- Add `mat[i][i]` (primary diagonal).  
- Add `mat[i][n - i - 1]` (secondary diagonal).  
- If `n` is odd, subtract the middle element once to avoid double-counting.  

## ⏱️ Complexity
- **Time:** O(n)  
- **Space:** O(1)  

## ✅ Code
See `matrix_diagonal_sum.java` in this folder.
