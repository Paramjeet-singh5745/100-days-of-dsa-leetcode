# 86 - Path Sum  

🔗 [LeetCode Problem Link](https://leetcode.com/problems/path-sum/)  
📌 Difficulty: Easy  
📚 Topic: Binary Tree / DFS  
🖥️ Language: Java  

## 💡 Approach  
- Traverse the tree using **DFS recursion**.  
- Subtract the current node’s value from the target sum.  
- If a **leaf node** is reached and the remaining sum is `0`, return true.  

## ✅ Code  
See `path_sum.java` in this folder.  
