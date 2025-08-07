# 25 - Find Peak Element

🔗 [LeetCode Problem Link](https://leetcode.com/problems/find-peak-element/)  
📌 Difficulty: Medium  
📚 Topic: Binary Search  
🖥️ Language: Java

## 💡 Approach
- Used Binary Search instead of a linear approach.
- If `nums[mid] > nums[mid + 1]`, move left (there’s a peak on the left side).
- Otherwise, move right.
- Guaranteed to find a peak in O(log n) time.

## ✅ Code
See `find_peak_element.java` in this folder.
