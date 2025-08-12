# 32 - Largest Number

🔗 [LeetCode Problem Link](https://leetcode.com/problems/largest-number/)  
📌 Difficulty: Medium  
📚 Topic: Sorting / String Manipulation  
🖥️ Language: Java

## 💡 Approach
- Converted each integer to a string.
- Sorted strings using a custom comparator that compares concatenations (`a+b` vs `b+a`).
- Special handling for the case where all numbers are zeros to avoid leading zeros.
- Joined all strings to form the final largest number.

## ✅ Code
See `largest_number.java` in this folder.
