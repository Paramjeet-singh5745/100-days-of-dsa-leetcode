# 6 - Two Sum

🔗 [LeetCode Problem Link](https://leetcode.com/problems/two-sum/)  
📌 Difficulty: Easy  
📚 Topic: Array, HashMap  
🖥️ Language: Java

## 💡 Approach
- Iterated over the array while storing each number’s index in a HashMap.
- For each number, checked if the complement (`target - current`) exists in the map.
- If found, returned the current and stored index as the answer.

## ✅ Code
See `two_sum.java` in this folder.
