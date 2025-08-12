# 35 - Kth Largest Element in an Array

🔗 [LeetCode Problem Link](https://leetcode.com/problems/kth-largest-element-in-an-array/)  
📌 Difficulty: Medium  
📚 Topic: Heap / Sorting  
🖥️ Language: Java  

## 💡 Approach
- **Heap Approach**:
  - Use a Min Heap of size `k`.
  - Iterate through the array, keep only top k elements in heap.
  - The root of the heap will be the kth largest element.
- **Sorting Approach**:
  - Sort the array in descending order.
  - Return element at index `k-1`.

### ⏳ Time Complexity:
- Heap: O(n log k)  
- Sorting: O(n log n)  

## ✅ Code
See `kth_largest_element_in_an_array.java` in this folder.
