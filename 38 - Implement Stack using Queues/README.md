# 38 - Implement Stack using Queues

🔗 [LeetCode Problem Link](https://leetcode.com/problems/implement-stack-using-queues/)  
📌 Difficulty: Easy  
📚 Topic: Stack / Queue  
🖥️ Language: Java  

## 💡 Approach
- Used two queues to implement stack functionality (LIFO).
- **Push:** Add element to the main queue (O(1)).
- **Pop/Top:** Transfer all but last element to a helper queue, pop/top the last, then swap queues (O(n)).
- Maintains correct stack order using queue operations.

## ✅ Code
See `implement_stack_using_queues.java` in this folder.
