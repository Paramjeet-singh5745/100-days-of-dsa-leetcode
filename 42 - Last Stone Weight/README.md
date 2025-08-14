# 42 - Last Stone Weight

🔗 [LeetCode Problem Link](https://leetcode.com/problems/last-stone-weight/)  
📌 Difficulty: Easy  
📚 Topic: Heap / Priority Queue  
🖥️ Language: Java  

## 💡 Approach
- Used a max-heap to always pick the two heaviest stones.  
- Subtracted their weights and added the difference back if non-zero.  
- Continued until only one or zero stones remain.  
- Time complexity: **O(n log n)** due to heap operations.

## ✅ Code
See `last_stone_weight.java` in this folder.
