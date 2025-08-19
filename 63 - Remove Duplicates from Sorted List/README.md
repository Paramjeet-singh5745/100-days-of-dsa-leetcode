# 63 - Remove Duplicates from Sorted List

🔗 [LeetCode Problem Link](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)  
📌 Difficulty: Easy  
📚 Topic: Linked List  
🖥️ Language: Java  

## 💡 Approach
1. Start with the head of the linked list.  
2. While traversing, if `current.val == current.next.val`, skip the next node.  
3. Otherwise, move the pointer forward.  
4. Continue until the end of the list.  

## ⏱️ Complexity
- **Time:** O(n) — each node is visited once.  
- **Space:** O(1) — done in-place.  

## ✅ Code
See `remove_duplicates_from_sorted_list.java` in this folder.
