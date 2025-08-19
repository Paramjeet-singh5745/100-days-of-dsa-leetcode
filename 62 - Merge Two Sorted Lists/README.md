# 62 - Merge Two Sorted Lists

🔗 [LeetCode Problem Link](https://leetcode.com/problems/merge-two-sorted-lists/)  
📌 Difficulty: Easy  
📚 Topic: Linked List  
🖥️ Language: Java  

## 💡 Approach
1. Create a **dummy node** as the starting point.  
2. Use a pointer (`curr`) to build the merged list.  
3. Compare `list1` and `list2` nodes:  
   - Attach the smaller node to `curr.next`.  
   - Move that list’s pointer forward.  
4. Once one list ends, attach the remaining nodes of the other list.  
5. Return `dummy.next` as the head of the merged list.  

## ⏱️ Complexity
- **Time:** O(n + m) where n, m are the lengths of the two lists.  
- **Space:** O(1) (in-place merging).  

## ✅ Code
See `merge_two_sorted_lists.java` in this folder.
