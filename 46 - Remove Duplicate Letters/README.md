# 46 - Remove Duplicate Letters

🔗 [LeetCode Problem Link](https://leetcode.com/problems/remove-duplicate-letters/)  
📌 Difficulty: Medium  
📚 Topic: Stack / Greedy  
🖥️ Language: Java  

## 💡 Approach
- Count frequency of each character.  
- Iterate through the string and use a stack to maintain the result.  
- If the current character is smaller than the top of the stack and the top still occurs later, pop it.  
- Keep track of visited characters to avoid duplicates.  

## ✅ Code
See `remove_duplicate_letters.java` in this folder.
