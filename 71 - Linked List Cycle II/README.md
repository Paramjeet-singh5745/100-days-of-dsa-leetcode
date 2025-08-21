# 71 - Linked List Cycle II

🔗 [LeetCode Problem Link](https://leetcode.com/problems/linked-list-cycle-ii/)  
📌 Difficulty: Medium  
📚 Topic: Linked List / Two-Pointer  
🖥️ Language: Java  

## 💡 Approach
1. Use Floyd’s Cycle Detection to check if a cycle exists.  
2. If no cycle → return `null`.  
3. If cycle exists → place one pointer at `head`, another at meeting point.  
4. Move both one step at a time → they meet at cycle start.  

## ⏱️ Complexity
- **Time:** O(n)  
- **Space:** O(1)  

## ✅ Code
See `linked_list_cycle_ii.java` in this folder.
