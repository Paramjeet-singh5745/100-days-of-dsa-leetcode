# 54 - Minimum Add to Make Parentheses Valid

🔗 [LeetCode Problem Link](https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/)  
📌 Difficulty: Medium  
📚 Topic: Stack / Greedy  
🖥️ Language: Java  

## 💡 Approach
- Maintained a balance counter.  
- Incremented balance for `"("` and decremented for `")"`.  
- If balance < 0 → need extra `"("` (fix immediately).  
- Final answer = required `"("` + remaining unmatched `"("`.  

## ✅ Code
See `minimum_add_to_make_parentheses_valid.java` in this folder.
