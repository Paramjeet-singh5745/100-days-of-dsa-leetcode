# 10 - Missing Number

🔗 [LeetCode Problem Link](https://leetcode.com/problems/missing-number/)  
📌 Difficulty: Easy  
📚 Topic: Math, Bit Manipulation  
🖥️ Language: Java

## 💡 Approach

### Method 1: Sum Formula
- Calculate the expected sum of first `n` natural numbers using `n*(n+1)/2`.
- Subtract the actual sum of elements from it to get the missing number.

### Method 2: XOR
- XOR all indices and all values in the array.
- Final result gives the missing number because duplicates cancel out.

## ✅ Code
See `missing_number.java` in this folder.
