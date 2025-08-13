# 39 - Implement Queue using Stacks

🔗 [LeetCode Problem Link](https://leetcode.com/problems/implement-queue-using-stacks/)  
📌 Difficulty: Easy  
📚 Topic: Stack / Queue  
🖥️ Language: Java  

## 💡 Approach
- Used two stacks: one for input (`inStack`) and one for output (`outStack`).
- Push operation simply appends to `inStack`.
- Pop and Peek transfer elements to `outStack` only when needed, ensuring FIFO order.
- Achieves O(1) amortized time complexity for each operation.

## ✅ Code
See `implement_queue_using_stacks.java` in this folder.

---
**Commit Message Example:**
