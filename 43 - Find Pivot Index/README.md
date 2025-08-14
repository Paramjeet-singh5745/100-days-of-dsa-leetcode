# 43 - Find Pivot Index

🔗 [LeetCode Problem Link](https://leetcode.com/problems/find-pivot-index/)  
📌 Difficulty: Easy  
📚 Topic: Array / Prefix Sum  
🖥️ Language: Java  

## 💡 Approach
- Calculate the total sum of the array.
- Iterate while keeping track of the left sum.
- At each index, check if `leftSum == totalSum - leftSum - nums[i]`.
- If yes, return the index as pivot.
- If no pivot is found, return -1.

## ✅ Code
See `find_pivot_index.java` in this folder.
