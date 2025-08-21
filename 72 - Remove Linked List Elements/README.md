# 72 - Remove Linked List Elements

🔗 [LeetCode Problem Link](https://leetcode.com/problems/remove-linked-list-elements/)  
📌 Difficulty: Easy  
📚 Topic: Linked List  
🖥️ Language: Java  

## 💡 Approach
1. Create a dummy node pointing to head.  
2. Use a `current` pointer to traverse the list.  
3. If `current.next.val == target`, skip the node by linking to `current.next.next`.  
4. Otherwise, move forward.  
5. Return `dummy.next` as the new head.  

## ⏱️ Complexity
- **Time:** O(n) (visit each node once)  
- **Space:** O(1)  

## ✅ Code
See `remove_linked_list_elements.java` in this folder.
