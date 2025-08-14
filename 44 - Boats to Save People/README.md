# 44 - Boats to Save People

🔗 [LeetCode Problem Link](https://leetcode.com/problems/boats-to-save-people/)  
📌 Difficulty: Medium  
📚 Topic: Greedy, Two-Pointer  
🖥️ Language: Java

## 💡 Approach
- Sort the `people` array in ascending order of weight.
- Use two pointers: one at the lightest person, one at the heaviest.
- If the sum of weights ≤ limit, put them in the same boat and move both pointers.
- Else, move only the heavy pointer (boat carries single person).
- Count each boat until all are allocated.

## ✅ Code
See `boats_to_save_people.java` in this folder.
