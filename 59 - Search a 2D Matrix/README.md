# 59 - Search a 2D Matrix

🔗 [LeetCode Problem Link](https://leetcode.com/problems/search-a-2d-matrix/)  
📌 Difficulty: Medium  
📚 Topic: Binary Search  
🖥️ Language: Java  

## 💡 Approach
- Consider the 2D matrix as a single sorted 1D array.  
- Use binary search:  
  - mid → row = mid / cols, col = mid % cols.  
- Compare target with matrix[row][col].  
- Adjust search space accordingly.  

## ⏱️ Complexity
- **Time:** O(log(m × n))  
- **Space:** O(1)  

## ✅ Code
See `search_a_2d_matrix.java` in this folder.
