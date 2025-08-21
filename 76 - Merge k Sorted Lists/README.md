# 76 - Merge k Sorted Lists

🔗 [LeetCode Problem Link](https://leetcode.com/problems/merge-k-sorted-lists/)  
📌 Difficulty: Hard  
📚 Topic: Linked List / Heap  
🖥️ Language: Java  

## 💡 Approach
1. Use a **PriorityQueue (min-heap)** to always extract the smallest node.  
2. Insert the head of each linked list into the heap.  
3. Repeatedly poll the smallest node, attach it to the result, and push its next node into the heap.  
4. Continue until heap is empty.  

## ⏱️ Complexity
- **Time:** O(N log k), where N = total nodes, k = number of lists.  
- **Space:** O(k) for the heap.  

## ✅ Code
See `merge_k_sorted_lists.java` in this folder.
