# 40 - Longest Consecutive Sequence

🔗 [LeetCode Problem Link](https://leetcode.com/problems/longest-consecutive-sequence/)  
📌 Difficulty: Medium  
📚 Topic: Arrays / HashSet  
🖥️ Language: Java  

## 💡 Approach
- Stored all numbers in a **HashSet** for O(1) average lookup.
- Iterated through the set and started counting only when the number is **the start of a sequence** (`num - 1` not present).
- Kept track of the longest streak found.

## ✅ Code
See `longest_consecutive_sequence.java` in this folder.
