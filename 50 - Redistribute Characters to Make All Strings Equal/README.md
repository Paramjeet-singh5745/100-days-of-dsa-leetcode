# 50 - Redistribute Characters to Make All Strings Equal

🔗 [LeetCode Problem Link](https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/)  
📌 Difficulty: Easy  
📚 Topic: Hashing / Frequency Count  
🖥️ Language: Java  

## 💡 Approach
- Count the frequency of all characters across all strings.  
- For each character, checked if `count % numberOfStrings == 0`.  
- If true for all characters → redistribution possible.  
- Otherwise, not possible.  

## ✅ Code
See `redistribute_characters_to_make_all_strings_equal.java` in this folder.
