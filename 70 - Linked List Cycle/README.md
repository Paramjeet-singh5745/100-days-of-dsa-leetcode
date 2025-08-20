# 70 - Linked List Cycle

🔗 [LeetCode Problem Link](https://leetcode.com/problems/linked-list-cycle/)  
📌 Difficulty: Easy  
📚 Topic: Linked List / Two-Pointer  
🖥️ Language: Java  

## 💡 Approach
1. Initialize two pointers → `slow` and `fast`.  
2. Move `slow` by 1 step, `fast` by 2 steps.  
3. If `slow == fast`, a cycle exists.  
4. If `fast` reaches `null`, no cycle.  

## ⏱️ Complexity
- **Time:** O(n)  
- **Space:** O(1)  

## ✅ Code
See `linked_list_cycle.java` in this folder.
