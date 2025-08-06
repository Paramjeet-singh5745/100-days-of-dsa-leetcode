#  18 - Increasing Triplet Subsequence

🔗 [LeetCode Problem Link](https://leetcode.com/problems/increasing-triplet-subsequence/)  
📌 Difficulty: Medium  
📚 Topic: Greedy  
🖥️ Language: Java

## 💡 Approach
- Initialize `first` and `second` with `Integer.MAX_VALUE`.
- Iterate through the array:
  - If current < first → update first.
  - Else if current < second → update second.
  - Else → found a triplet.
- Greedy strategy for O(n) time and O(1) space.

## ✅ Code
See `increasing_triplet_subsequence.java` in this folder.
