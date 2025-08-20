# 67 - Intersection of Two Linked Lists

🔗 [LeetCode Problem Link](https://leetcode.com/problems/intersection-of-two-linked-lists/)  
📌 Difficulty: Easy  
📚 Topic: Linked List  
🖥️ Language: Java  

## 💡 Approach
1. Use two pointers `a` and `b` starting from headA and headB.  
2. Move both one step at a time.  
3. When `a` reaches null → redirect to headB.  
4. When `b` reaches null → redirect to headA.  
5. If they meet → intersection node found, else both null (no intersection).  

## ⏱️ Complexity
- **Time:** O(n + m) → both lists fully traversed.  
- **Space:** O(1) → no extra memory used.  

## ✅ Code
See `intersection_of_two_linked_lists.java` in this folder.
