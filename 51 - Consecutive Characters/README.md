# 51 - Consecutive Characters

🔗 [LeetCode Problem Link](https://leetcode.com/problems/consecutive-characters/)  
📌 Difficulty: Easy  
📚 Topic: String / Sliding Window  
🖥️ Language: Java  

## 💡 Approach
- Initialized two variables: `count` for current streak and `maxCount` for longest streak.  
- Iterated through the string:  
  - If current char == previous char → increment `count`.  
  - Else reset `count` to 1.  
- Updated `maxCount` whenever needed.  

## ✅ Code
See `consecutive_characters.java` in this folder.
