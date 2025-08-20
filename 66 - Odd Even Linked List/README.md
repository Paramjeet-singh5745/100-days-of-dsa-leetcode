# 66 - Odd Even Linked List

🔗 [LeetCode Problem Link](https://leetcode.com/problems/odd-even-linked-list/)  
📌 Difficulty: Medium  
📚 Topic: Linked List  
🖥️ Language: Java  

## 💡 Approach
1. Use two pointers: `odd` (starting at head) and `even` (starting at head.next).  
2. Keep `evenHead` to reconnect even nodes later.  
3. Move `odd.next` to `odd.next.next`, and `even.next` to `even.next.next`.  
4. Continue until `even` or `even.next` is null.  
5. Finally, connect `odd.next = evenHead`.  

## ⏱️ Complexity
- **Time:** O(n) → single pass through the list.  
- **Space:** O(1) → rearranged in-place.  

## ✅ Code
See `odd_even_linked_list.java` in this folder.
