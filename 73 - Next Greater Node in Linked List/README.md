# 73 - Next Greater Node in Linked List

🔗 [LeetCode Problem Link](https://leetcode.com/problems/next-greater-node-in-linked-list/)  
📌 Difficulty: Medium  
📚 Topic: Linked List / Stack  
🖥️ Language: Java  

## 💡 Approach
1. Traverse the linked list and store values in an array.  
2. Use a **monotonic decreasing stack** to keep track of indices where the next greater node is not yet found.  
3. As we iterate, when a larger value appears, pop from stack and assign the next greater value.  
4. Return the filled array as result.  

## ⏱️ Complexity
- **Time:** O(n) (each element pushed/popped once)  
- **Space:** O(n) (array + stack)  

## ✅ Code
See `next_greater_node_in_linked_list.java` in this folder.
