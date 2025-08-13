# 37 - Min Stack

🔗 [LeetCode Problem Link](https://leetcode.com/problems/min-stack/)  
📌 Difficulty: Medium  
📚 Topic: Stack / Design  
🖥️ Language: Java  

## 💡 Approach
- Used **two stacks**:
  1. **Main Stack** to store values.
  2. **Min Stack** to store the current minimum after each push.
- On `push(x)`:
  - Push to main stack.
  - If min stack is empty or `x <= current min`, push to min stack too.
- On `pop()`:
  - If popped element equals current min, pop from min stack too.
- On `getMin()`:
  - Return top of min stack (O(1) time).

## ✅ Code
See `min_stack.java` in this folder.
