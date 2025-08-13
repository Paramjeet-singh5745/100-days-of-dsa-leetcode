# 36 - Average Salary Excluding the Minimum and Maximum Salary

🔗 [LeetCode Problem Link](https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/)  
📌 Difficulty: Easy  
📚 Topic: Array / Math  
🖥️ Language: Java

## 💡 Approach
- Iterate through the array to find **min salary**, **max salary**, and total **sum** in a single pass.
- Subtract min and max from the sum, then divide by `(n - 2)` to get the average.
- Avoided sorting to achieve **O(n)** time complexity and **O(1)** space.

## ✅ Code
See `average_salary_excluding_the_minimum_and_maximum_salary.java` in this folder.
