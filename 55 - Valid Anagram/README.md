# 55 - Valid Anagram

🔗 [LeetCode Problem Link](https://leetcode.com/problems/valid-anagram/)  
📌 Difficulty: Easy  
📚 Topic: Hashing / Sorting  
🖥️ Language: Java  

## 💡 Approach
- Checked length first → if not equal, return false.  
- Used an integer array of size 26 to count characters in both strings.  
- Incremented for one string and decremented for the other.  
- If all counts become zero → strings are anagrams.  

## ✅ Code
See `valid_anagram.java` in this folder.
