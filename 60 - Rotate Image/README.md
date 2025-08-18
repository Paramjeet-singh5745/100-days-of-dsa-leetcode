# 60 - Rotate Image

🔗 [LeetCode Problem Link](https://leetcode.com/problems/rotate-image/)  
📌 Difficulty: Medium  
📚 Topic: Matrix / Simulation  
🖥️ Language: Java  

## 💡 Approach
1. **Transpose** the matrix → swap `matrix[i][j]` with `matrix[j][i]`.  
2. **Reverse each row** → gives 90° clockwise rotation.  
3. Done in-place → no extra matrix required.  

## ⏱️ Complexity
- **Time:** O(n²)  
- **Space:** O(1)  

## ✅ Code
See `rotate_image.java` in this folder.
